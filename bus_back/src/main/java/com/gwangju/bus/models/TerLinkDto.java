package com.gwangju.bus.models;

public class TerLinkDto {

	private String tl_Id;
	private String DepTerId;
	private String ArrTerId;
	public String getTl_Id() {
		return tl_Id;
	}
	public void setTl_Id(String tl_Id) {
		this.tl_Id = tl_Id;
	}
	public String getDepTerId() {
		return DepTerId;
	}
	public void setDepTerId(String depTerId) {
		DepTerId = depTerId;
	}
	public String getArrTerId() {
		return ArrTerId;
	}
	public void setArrTerId(String arrTerId) {
		ArrTerId = arrTerId;
	}
	
	@Override
	public String toString() {
		return "TerLinkDto [tl_Id=" + tl_Id + ", DepTerId=" + DepTerId + ", ArrTerId=" + ArrTerId + "]";
	}	
}
