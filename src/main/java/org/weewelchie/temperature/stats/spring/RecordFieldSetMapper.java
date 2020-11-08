package org.weewelchie.temperature.stats.spring;

import org.apache.log4j.Logger;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;
import org.weewelchie.temperature.stats.beans.SenseHatData;

public class RecordFieldSetMapper implements FieldSetMapper<SenseHatData> {
	 
	static Logger LOG = Logger.getLogger(RecordFieldSetMapper.class.getName());  
    public SenseHatData mapFieldSet(FieldSet fieldSet) throws BindException {
        SenseHatData sd = new SenseHatData();
        
        
        //temp_p","humidity","pressure","pitch","roll","yaw","mag_x","mag_y","mag_z","accel_x","accel_y","accel_z","gyro_x","gyro_y","gyro_z","timestamp" };
        sd.setTemperature(fieldSet.readDouble("temp_p"));
		sd.setHumidity(fieldSet.readDouble("humidity"));
		sd.setPressure(fieldSet.readDouble("pressure"));
		sd.setPitch(fieldSet.readDouble("pitch"));
		sd.setRoll(fieldSet.readDouble("roll"));
		sd.setYaw(fieldSet.readDouble("yaw"));
		sd.setMagX(fieldSet.readDouble("mag_x"));
		sd.setMagY(fieldSet.readDouble("mag_y"));
		sd.setMagZ(fieldSet.readDouble("mag_z"));
		sd.setAccelX(fieldSet.readDouble("accel_x"));
        sd.setAccelY(fieldSet.readDouble("accel_y"));
        sd.setAccelZ(fieldSet.readDouble("accel_z"));
		sd.setGyroX(fieldSet.readString("gyro_x"));
		sd.setGyroY(fieldSet.readString("gyro_y"));
		sd.setGyroZ(fieldSet.readString("gyro_z"));
		sd.setTimestamp(fieldSet.readDate("timestamp"));
        
		LOG.info(sd);
        return sd;
    }
}
