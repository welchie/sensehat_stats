package org.weewelchie.temperature.stats.spring;

import org.springframework.batch.item.ItemProcessor;
import org.weewelchie.temperature.stats.beans.SenseHatData;

public class CustomItemProcessor implements ItemProcessor<SenseHatData, SenseHatData> {
	 
    public SenseHatData process(SenseHatData item) {
        return item;
    }
}
