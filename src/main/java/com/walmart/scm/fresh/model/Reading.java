package com.walmart.scm.fresh.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Reading implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="read_id")
	private Long readingId;
	private Timestamp timestamp;
	private Integer ambientTemp;
	private Integer shelfLife;
	private Integer batteryLife;
	private Integer proximity;
	private Integer light;
	private Integer vibration;
	
	//private GPS agps;
	
	
	public Reading()
	{
		
	}
	
	public Timestamp getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
	public Integer getAmbientTemp() {
		return ambientTemp;
	}
	public void setAmbientTemp(Integer ambientTemp) {
		this.ambientTemp = ambientTemp;
	}
	public Integer getShelfLife() {
		return shelfLife;
	}
	public void setShelfLife(Integer shelfLife) {
		this.shelfLife = shelfLife;
	}
	public Integer getBatteryLife() {
		return batteryLife;
	}
	public void setBatteryLife(Integer batteryLife) {
		this.batteryLife = batteryLife;
	}
	public Integer getProximity() {
		return proximity;
	}
	public void setProximity(Integer proximity) {
		this.proximity = proximity;
	}
	public Integer getLight() {
		return light;
	}
	public void setLight(Integer light) {
		this.light = light;
	}
	public Integer getVibration() {
		return vibration;
	}
	public void setVibration(Integer vibration) {
		this.vibration = vibration;
	}
	public Long getReadingId() {
		return readingId;
	}
	public void setReadingId(Long id) {
		this.readingId = id;
	}
	
	@OneToMany(mappedBy="reading", cascade={CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
	private List<GPS> gps;
	public List<GPS> getGps() {
		return gps;
	}
	public void setGps(List<GPS> gps) {
		this.gps = gps;
	}
	/*public GPS getAgps() {
		return agps;
	}
	public void setAgps(GPS agps) {
		this.agps = agps;
	}*/
	

}
