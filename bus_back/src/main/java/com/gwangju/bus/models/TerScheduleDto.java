package com.gwangju.bus.models;

public class TerScheduleDto {

	private String td_Id;
	private String tes_Schedule;
	
	public String getTd_Id() {
		return td_Id;
	}
	public void setTd_Id(String td_Id) {
		this.td_Id = td_Id;
	}
	public String getTes_Schedule() {
		return tes_Schedule;
	}
	public void setTes_Schedule(String tes_Schedule) {
		this.tes_Schedule = tes_Schedule;
	}
	
	@Override
	public String toString() {
		return "TerScheduleDto [td_Id=" + td_Id + ", tes_Schedule=" + tes_Schedule + "]";
	}
}
