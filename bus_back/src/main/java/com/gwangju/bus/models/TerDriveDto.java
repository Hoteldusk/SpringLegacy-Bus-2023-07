package com.gwangju.bus.models;

public class TerDriveDto {

	private String td_ID;
	private String tl_ID;
	private String td_INTERVAL;
	private String td_WASTETIME;
	private int td_FARE;

	public String getTd_ID() {
		return td_ID;
	}

	public void setTd_ID(String td_ID) {
		this.td_ID = td_ID;
	}

	public String getTl_ID() {
		return tl_ID;
	}

	public void setTl_ID(String tl_ID) {
		this.tl_ID = tl_ID;
	}

	public String getTd_INTERVAL() {
		return td_INTERVAL;
	}

	public void setTd_INTERVAL(String td_INTERVAL) {
		this.td_INTERVAL = td_INTERVAL;
	}

	public String getTd_WASTETIME() {
		return td_WASTETIME;
	}

	public void setTd_WASTETIME(String td_WASTETIME) {
		this.td_WASTETIME = td_WASTETIME;
	}

	public int getTd_FARE() {
		return td_FARE;
	}

	public void setTd_FARE(int td_FARE) {
		this.td_FARE = td_FARE;
	}

	@Override
	public String toString() {
		return "TerDriveDto [td_ID=" + td_ID + ", tl_ID=" + tl_ID + ", td_INTERVAL=" + td_INTERVAL + ", td_WASTETIME="
				+ td_WASTETIME + ", td_FARE=" + td_FARE + "]";
	}
	
}
