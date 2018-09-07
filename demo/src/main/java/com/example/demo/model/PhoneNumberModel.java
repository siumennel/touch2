package com.example.demo;

public class PhoneNumberModel {
	private String areaCode;
	private String phoneNumber;

	public PhoneNumberModel() {
	}

	public PhoneNumberModel(String areaCode, String phoneNumber) {
		this.areaCode = areaCode;
		this.phoneNumber = phoneNumber;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
