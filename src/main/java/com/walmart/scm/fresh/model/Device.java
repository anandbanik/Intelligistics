package com.walmart.scm.fresh.model;

import java.sql.Timestamp;

public class Device {
	
	private String deviceType;
	private String deviceSerial;
	private Timestamp startDate;
	private Timestamp endDate;
	private String deviceMacAddress;
	private String palletBarCode;
	private String ptiBarCode;
	private Reading reading;
	
	
	
	
	public String getDeviceType() {
		return deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}
	public String getDeviceSerial() {
		return deviceSerial;
	}
	public void setDeviceSerial(String deviceSerial) {
		this.deviceSerial = deviceSerial;
	}
	public Timestamp getStartDate() {
		return startDate;
	}
	public void setStartDate(Timestamp startDate) {
		this.startDate = startDate;
	}
	public Timestamp getEndDate() {
		return endDate;
	}
	public void setEndDate(Timestamp endDate) {
		this.endDate = endDate;
	}
	public String getDeviceMacAddress() {
		return deviceMacAddress;
	}
	public void setDeviceMacAddress(String deviceMacAddress) {
		this.deviceMacAddress = deviceMacAddress;
	}
	public String getPalletBarCode() {
		return palletBarCode;
	}
	public void setPalletBarCode(String palletBarCode) {
		this.palletBarCode = palletBarCode;
	}
	public String getPtiBarCode() {
		return ptiBarCode;
	}
	public void setPtiBarCode(String ptiBarCode) {
		this.ptiBarCode = ptiBarCode;
	}
	public Reading getReading() {
		return reading;
	}
	public void setReading(Reading reading) {
		this.reading = reading;
	}
	
	

}
