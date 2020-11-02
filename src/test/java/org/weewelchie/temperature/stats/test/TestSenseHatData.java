package org.weewelchie.temperature.stats.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;
import org.weewelchie.temperature.stats.beans.SenseHatData;

public class TestSenseHatData {

	private Date dNow = Calendar.getInstance().getTime();
	private SenseHatData testData = new SenseHatData(13.5D, 123456D, 10000D, 
			25.2555555D, 0.1125D, 1.1D, 1.5D, 2.5D, 3.5D, 
			100D, 200D, 300D, 
			"['X']", "['Y']", "['Z']", dNow);
	/**
	 * Test Data
	 * 	temp_p,humidity,pressure,pitch,roll,yaw,mag_x,mag_y,mag_z,accel_x,accel_y,accel_z,gyro_x,gyro_y,gyro_z,timestamp
		13.4468740463,
		142.692657471,
		1002.28222656,
		5.93950133951,
		358.694587245,
		119.680200222,
		-62.4204025269,
		-114.392883301,
		-37.1800804138,
		-0.107603996992,
		-0.0326960012317,
		0.921099960804,
		['x'],
		['y'],
		['z'],
		2020-10-25 12:17:24.782257
	 */
	
	@Test
	public void testCreateNoArgs()
	{
		SenseHatData sd = new SenseHatData();
		sd.setTemperature(13.4468740463);
		sd.setHumidity(142.692657471);
		sd.setPressure(1002.28222656);
		sd.setPitch(5.93950133951);
		sd.setRoll(358.694587245);
		sd.setYaw(119.680200222);
		sd.setMagX(-62.4204025269);
		sd.setMagY(-114.392883301);
		sd.setMagZ(-37.1800804138);
		sd.setAccelX(-0.107603996992);
		sd.setAccelY(-0.0326960012317);
		sd.setAccelZ(0.921099960804);
		sd.setGyroX("['x']");
		sd.setGyroY("['y']");
		sd.setGyroZ("['z']");
		
		Calendar c = Calendar.getInstance();
		//c.setTime(new Date("2020-10-25 12:17:24.782257"));
		sd.setTimestamp(c.getTime());
		
		assertTrue(sd.getTemperature().equals(13.4468740463));
		assertTrue(sd.getHumidity().equals(142.692657471));
		assertTrue(sd.getPressure().equals(1002.28222656));
		assertTrue(sd.getPitch().equals(5.93950133951));
		assertTrue(sd.getRoll().equals(358.694587245));
		assertTrue(sd.getYaw().equals(119.680200222));
		assertTrue(sd.getMagX().equals(-62.4204025269));
		assertTrue(sd.getMagY().equals(-114.392883301));
		assertTrue(sd.getMagZ().equals(-37.1800804138));
		assertTrue(sd.getAccelX().equals(-0.107603996992));
		assertTrue(sd.getAccelY().equals(-0.0326960012317));
		assertTrue(sd.getAccelZ().equals(0.921099960804));
		assertTrue(sd.getGyroX().equals("['x']"));
		assertTrue(sd.getGyroY().equals("['y']"));
		assertTrue(sd.getGyroZ().equals("['z']"));
		assertTrue(sd.getTimestamp().equals(c.getTime()));
		
	}
	
	@Test
	public void testCreate()
	{
		SenseHatData sd = new SenseHatData(	13.5D, 123456D, 10000D, 
											25.2555555D, 0.1125D, 1.1D, 1.5D, 2.5D, 3.5D, 
											100D, 200D, 300D, 
											"['X']", "['Y']", "['Z']", dNow);
		
		assertEquals(sd,testData);
		
	}
	
	@Test
	public void testToString()
	{
		assertTrue(testData.toString().contains("temperature=13.5"));
		assertTrue(testData.toString().contains("humidity=123456"));
	}
	

}
