package org.weewelchie.temperature.stats.app;

import org.apache.log4j.Logger;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.weewelchie.temperature.stats.spring.SpringBatchConfig;
import org.weewelchie.temperature.stats.spring.SpringConfig;


public class App {
	
	static Logger LOG = Logger.getLogger(App.class.getName());
	
    public static void main(String[] args) {
        // Spring Java config
    	LOG.info("Starting batch loader");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(SpringConfig.class);
        context.register(SpringBatchConfig.class);
        context.refresh();
        
        JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
        Job job = (Job) context.getBean("firstBatchJob");
        LOG.info("Starting the batch job");
        try {
            JobExecution execution = jobLauncher.run(job, new JobParameters());
            LOG.info("Job Status : " + execution.getStatus());
            LOG.info("Job completed");
        } catch (Exception e) {
            e.printStackTrace();
            LOG.error("Job failed");
        }
        
        context.close();
    }
    
}
