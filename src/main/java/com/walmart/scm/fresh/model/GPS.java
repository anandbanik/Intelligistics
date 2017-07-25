package com.walmart.scm.fresh.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class GPS implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String latitude;
	private String longitude;
	private String location;
	private String context;

	/*@ManyToOne
	@JoinColumn(name="read_id", referencedColumnName="read_id", nullable=false)*/
	@ManyToOne(targetEntity=Reading.class, fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	private Reading reading;
	
	
	public GPS()
	{
		
	}

	public GPS(String lat, String lon, String loc)
	{
		this.latitude = lat;
		this.longitude = lon;
		this.location = loc;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String getContext(){
		return context;
	}
	
	public void setContext(String context){
		this.context = context;
	}

	public Reading getReading(){
		return reading;
	}
	public void setReading(Reading reading){
		this.reading = reading;
	}
	
	public String toString()
	{
		return "Latitude: "+this.latitude+" Longitude: "+this.longitude+ " Location: "+this.location;
	}

}
