package com.ssafy.happyhouse.dto;

public class House {
	private String sigungucode;
	private String sigungu;
	private String dongcode;
	private String dong;
	private double area;
	private String floor;
	private int typecode;
	private String type;
	private long price;
	private String buildyear;
	private String name;
	public String getSigungucode() {
		return sigungucode;
	}
	public void setSigungucode(String sigungucode) {
		this.sigungucode = sigungucode;
	}
	public String getSigungu() {
		return sigungu;
	}
	public void setSigungu(String sigungu) {
		this.sigungu = sigungu;
	}
	public String getDongcode() {
		return dongcode;
	}
	public void setDongcode(String dongcode) {
		this.dongcode = dongcode;
	}
	public String getDong() {
		return dong;
	}
	public void setDong(String dong) {
		this.dong = dong;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public String getFloor() {
		return floor;
	}
	public void setFloor(String floor) {
		this.floor = floor;
	}
	public int getTypecode() {
		return typecode;
	}
	public void setTypecode(int typecode) {
		this.typecode = typecode;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public String getBuildyear() {
		return buildyear;
	}
	public void setBuildyear(String buildyear) {
		this.buildyear = buildyear;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "House [sigungucode=" + sigungucode + ", sigungu=" + sigungu + ", dongcode=" + dongcode + ", dong="
				+ dong + ", area=" + area + ", floor=" + floor + ", typecode=" + typecode + ", type=" + type
				+ ", price=" + price + ", buildyear=" + buildyear + ", name=" + name + "]";
	}
	
}
