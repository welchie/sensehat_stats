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
	
	public SenseHatData(Double temp, Double humidity, Double pressure, 
						Double pitch, Double roll, Double yaw, 
						Double magX, Double magY, Double magZ, 
						Double accelX, Double accelY, Double accelZ,
						String gyroX, String gyroY, String gyroZ,
						Date timestamp)
	{
		this.setTemperature(temp);
		this.setHumidity(humidity);
		this.setPressure(pressure);
		this.setPitch(pitch);
		this.setRoll(roll);
		this.setYaw(yaw);
		this.setMagX(magX);
		this.setMagY(magY);
		this.setMagZ(magZ);
		this.setAccelX(accelX);
		this.setAccelY(accelY);
		this.setAccelZ(accelZ);
		this.setGyroX(gyroX);
		this.setGyroY(gyroY);
		this.setGyroZ(gyroZ);
		this.setTimestamp(timestamp);
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
	}

	@Override
	public String toString() {
		return "SenseHatData [temperature=" + temperature + ", humidity=" + humidity + ", pressure=" + pressure
				+ ", pitch=" + pitch + ", roll=" + roll + ", yaw=" + yaw + ", magX=" + magX + ", magY=" + magY
				+ ", magZ=" + magZ + ", accelX=" + accelX + ", accelY=" + accelY + ", accelZ=" + accelZ + ", gyroX="
				+ gyroX + ", gyroY=" + gyroY + ", gyroZ=" + gyroZ + ", timestamp=" + timestamp + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accelX == null) ? 0 : accelX.hashCode());
		result = prime * result + ((accelY == null) ? 0 : accelY.hashCode());
		result = prime * result + ((accelZ == null) ? 0 : accelZ.hashCode());
		result = prime * result + ((gyroX == null) ? 0 : gyroX.hashCode());
		result = prime * result + ((gyroY == null) ? 0 : gyroY.hashCode());
		result = prime * result + ((gyroZ == null) ? 0 : gyroZ.hashCode());
		result = prime * result + ((humidity == null) ? 0 : humidity.hashCode());
		result = prime * result + ((magX == null) ? 0 : magX.hashCode());
		result = prime * result + ((magY == null) ? 0 : magY.hashCode());
		result = prime * result + ((magZ == null) ? 0 : magZ.hashCode());
		result = prime * result + ((pitch == null) ? 0 : pitch.hashCode());
		result = prime * result + ((pressure == null) ? 0 : pressure.hashCode());
		result = prime * result + ((roll == null) ? 0 : roll.hashCode());
		result = prime * result + ((temperature == null) ? 0 : temperature.hashCode());
		result = prime * result + ((timestamp == null) ? 0 : timestamp.hashCode());
		result = prime * result + ((yaw == null) ? 0 : yaw.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SenseHatData other = (SenseHatData) obj;
		if (accelX == null) {
			if (other.accelX != null)
				return false;
		} else if (!accelX.equals(other.accelX))
			return false;
		if (accelY == null) {
			if (other.accelY != null)
				return false;
		} else if (!accelY.equals(other.accelY))
			return false;
		if (accelZ == null) {
			if (other.accelZ != null)
				return false;
		} else if (!accelZ.equals(other.accelZ))
			return false;
		if (gyroX == null) {
			if (other.gyroX != null)
				return false;
		} else if (!gyroX.equals(other.gyroX))
			return false;
		if (gyroY == null) {
			if (other.gyroY != null)
				return false;
		} else if (!gyroY.equals(other.gyroY))
			return false;
		if (gyroZ == null) {
			if (other.gyroZ != null)
				return false;
		} else if (!gyroZ.equals(other.gyroZ))
			return false;
		if (humidity == null) {
			if (other.humidity != null)
				return false;
		} else if (!humidity.equals(other.humidity))
			return false;
		if (magX == null) {
			if (other.magX != null)
				return false;
		} else if (!magX.equals(other.magX))
			return false;
		if (magY == null) {
			if (other.magY != null)
				return false;
		} else if (!magY.equals(other.magY))
			return false;
		if (magZ == null) {
			if (other.magZ != null)
				return false;
		} else if (!magZ.equals(other.magZ))
			return false;
		if (pitch == null) {
			if (other.pitch != null)
				return false;
		} else if (!pitch.equals(other.pitch))
			return false;
		if (pressure == null) {
			if (other.pressure != null)
				return false;
		} else if (!pressure.equals(other.pressure))
			return false;
		if (roll == null) {
			if (other.roll != null)
				return false;
		} else if (!roll.equals(other.roll))
			return false;
		if (temperature == null) {
			if (other.temperature != null)
				return false;
		} else if (!temperature.equals(other.temperature))
			return false;
		if (timestamp == null) {
			if (other.timestamp != null)
				return false;
		} else if (!timestamp.equals(other.timestamp))
			return false;
		if (yaw == null) {
			if (other.yaw != null)
				return false;
		} else if (!yaw.equals(other.yaw))
			return false;
		return true;
	};
	
	
}
