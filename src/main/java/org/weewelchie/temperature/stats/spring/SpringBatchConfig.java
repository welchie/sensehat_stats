package org.weewelchie.temperature.stats.spring;

import java.net.MalformedURLException;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.batch.item.xml.StaxEventItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.Resource;
import org.springframework.oxm.Marshaller;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.weewelchie.temperature.stats.beans.SenseHatData;
//import org.weewelchie.temperature.stats.transaction.Transaction;

public class SpringBatchConfig {

	@Autowired
	private JobBuilderFactory jobs;

	@Autowired
	private StepBuilderFactory steps;

	@Value("csv/senshat_data.csv")
	private Resource inputCsv;

	@Value("file:xml/output.xml")
	private Resource outputXml;

	@Bean
	public ItemReader<SenseHatData> itemReader() throws UnexpectedInputException, ParseException {
		FlatFileItemReader<SenseHatData> reader = new FlatFileItemReader<SenseHatData>();
		DelimitedLineTokenizer tokenizer = new DelimitedLineTokenizer();

		String[] tokens = { "temp_p", "humidity", "pressure", "pitch", "roll", "yaw", "mag_x", "mag_y", "mag_z",
				"accel_x", "accel_y", "accel_z", "gyro_x", "gyro_y", "gyro_z", "timestamp" };
		tokenizer.setNames(tokens);
		reader.setResource(inputCsv);
		DefaultLineMapper<SenseHatData> lineMapper = new DefaultLineMapper<SenseHatData>();
		lineMapper.setLineTokenizer(tokenizer);
		lineMapper.setFieldSetMapper(new RecordFieldSetMapper());
		reader.setLineMapper(lineMapper);
		reader.setLinesToSkip(1);
		return reader;
	}

	@Bean
	public ItemProcessor<SenseHatData, SenseHatData> itemProcessor() {
		return new CustomItemProcessor();
	}

	@Bean
	public ItemWriter<SenseHatData> itemWriter(Marshaller marshaller) throws MalformedURLException {
		StaxEventItemWriter<SenseHatData> itemWriter = new StaxEventItemWriter<SenseHatData>();
		itemWriter.setMarshaller(marshaller);
		itemWriter.setRootTagName("transactionRecord");
		itemWriter.setResource(outputXml);
		return itemWriter;
	}

	@Bean
	public Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setClassesToBeBound(new Class[] { SenseHatData.class });
		return marshaller;
	}

	@Bean
	protected Step step1(ItemReader<SenseHatData> reader, ItemProcessor<SenseHatData, SenseHatData> processor,
			ItemWriter<SenseHatData> writer) {
		return steps.get("step1").<SenseHatData, SenseHatData>chunk(10).reader(reader).processor(processor)
				.writer(writer).build();
	}

	@Bean(name = "firstBatchJob")
	public Job job(@Qualifier("step1") Step step1) {
		return jobs.get("firstBatchJob").start(step1).build();
	}
}
