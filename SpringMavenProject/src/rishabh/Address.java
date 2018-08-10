package com.rishabh;

public class Address {
	private int aId;
	private String city;
	private String state;

	public Address() {
		
	}
	
	public int getaId() {
		return aId;
	}

	public void setaId(int aId) {
		//System.out.println("setraId called");
		this.aId = aId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		//System.out.println("setcity called");
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		
		this.state = state;
	}

	public Address(int aId, String city, String state) {
		
		System.out.println("Address constructor called");
		this.aId = aId;
		this.city = city;
		this.state = state;
	}
	
	@Override
	public String toString() {
		return "Address [aId=" + aId + ", city=" + city + ", state=" + state + "]";
	}
}
