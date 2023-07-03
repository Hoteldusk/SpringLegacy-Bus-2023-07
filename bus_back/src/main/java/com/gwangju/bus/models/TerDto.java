package com.gwangju.bus.models;

public class TerDto {

	private String terId;
	private String terName;
	private String terRegion;
	private String TerCoorX;
	private String TerCoorY;
	
	public String getTerId() {
		return terId;
	}
	public void setTerId(String terId) {
		this.terId = terId;
	}
	public String getTerName() {
		return terName;
	}
	public void setTerName(String terName) {
		this.terName = terName;
	}
	public String getTerRegion() {
		return terRegion;
	}
	public void setTerRegion(String terRegion) {
		this.terRegion = terRegion;
	}
	public String getTerCoorX() {
		return TerCoorX;
	}
	public void setTerCoorX(String terCoorX) {
		TerCoorX = terCoorX;
	}
	public String getTerCoorY() {
		return TerCoorY;
	}
	public void setTerCoorY(String terCoorY) {
		TerCoorY = terCoorY;
	}
	@Override
	public String toString() {
		return "TerDto [terId=" + terId + ", terName=" + terName + ", terRegion=" + terRegion + ", TerCoorX=" + TerCoorX
				+ ", TerCoorY=" + TerCoorY + "]";
	}
		
}
