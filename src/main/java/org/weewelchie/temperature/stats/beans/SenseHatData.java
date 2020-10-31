package org.weewelchie.temperature.stats.beans;

import java.io.Serializable;
import java.util.Date;

public class SenseHatData implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 9019772799125729206L;
	private Double temperature;
	private Double humidity;
	private Double pressure;
	private Double pitch;
	private Double roll;
	private Double yaw;
	private Double magX;
	private Double magY;
	private Double magZ;
	private Double accelX;
	private Double accelY;
	private Double accelZ;
	private String gyroX;
	private String gyroY;
	private String gyroZ;
	private Date timestamp;
	
	public SenseHatData()
	{
		
	}

	public Double getTemperature() {
		return temperature;
	}

	public void setTemperature(Double temperature) {
		this.temperature = temperature;
	}

	public Double getHumidity() {
		return humidity;
	}

	public void setHumidity(Double humidity) {
		this.humidity = humidity;
	}

	public Double getPressure() {
		return pressure;
	}

	public void setPressure(Double pressure) {
		this.pressure = pressure;
	}

	public Double getPitch() {
		return pitch;
	}

	public void setPitch(Double pitch) {
		this.pitch = pitch;
	}

	public Double getRoll() {
		return roll;
	}

	public void setRoll(Double roll) {
		this.roll = roll;
	}

	public Double getYaw() {
		return yaw;
	}

	public void setYaw(Double yaw) {
		this.yaw = yaw;
	}

	public Double getMagX() {
		return magX;
	}

	public void setMagX(Double magX) {
		this.magX = magX;
	}

	public Double getMagY() {
		return magY;
	}

	public void setMagY(Double magY) {
		this.magY = magY;
	}

	public Double getMagZ() {
		return magZ;
	}

	public void setMagZ(Double magZ) {
		this.magZ = magZ;
	}

	public Double getAccelX() {
		return accelX;
	}

	public void setAccelX(Double accelX) {
		this.accelX = accelX;
	}

	public Double getAccelY() {
		return accelY;
	}

	public void setAccelY(Double accelY) {
		this.accelY = accelY;
	}

	public Double getAccelZ() {
		return accelZ;
	}

	public void setAccelZ(Double accelZ) {
		this.accelZ = accelZ;
	}

	public String getGyroX() {
		return gyroX;
	}

	public void setGyroX(String gyroX) {
		this.gyroX = gyroX;
	}

	public String getGyroY() {
		return gyroY;
	}

	public void setGyroY(String gyroY) {
		this.gyroY = gyroY;
	}

	public String getGyroZ() {
		return gyroZ;
	}

	public void setGyroZ(String gyroZ) {
		this.gyroZ = gyroZ;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	};
}
