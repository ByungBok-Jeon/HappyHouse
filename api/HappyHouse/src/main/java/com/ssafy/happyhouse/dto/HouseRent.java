package com.ssafy.happyhouse.dto;

public class HouseRent {
	private String sigungucode;
	private String sigungu;
	private String dongcode;
	private String dong;
	private String name;
	private String floor;
	private int typecode;
	private String type;
	private double area;
	private int renttypecode;
	private String renttype;
	private int rentprice1;
	private int rentprice2;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public int getRenttypecode() {
		return renttypecode;
	}
	public void setRenttypecode(int renttypecode) {
		this.renttypecode = renttypecode;
	}
	public String getRenttype() {
		return renttype;
	}
	public void setRenttype(String renttype) {
		this.renttype = renttype;
	}
	public int getRentprice1() {
		return rentprice1;
	}
	public void setRentprice1(int rentprice1) {
		this.rentprice1 = rentprice1;
	}
	public int getRentprice2() {
		return rentprice2;
	}
	public void setRantprice2(int rentprice2) {
		this.rentprice2 = rentprice2;
	}
	@Override
	public String toString() {
		return "HouseRent [sigungucode=" + sigungucode + ", sigungu=" + sigungu + ", dongcode=" + dongcode + ", dong="
				+ dong + ", name=" + name + ", floor=" + floor + ", typecode=" + typecode + ", type=" + type + ", area="
				+ area + ", renttypecode=" + renttypecode + ", renttype=" + renttype + ", rentprice1=" + rentprice1
				+ ", rentprice2=" + rentprice2 + "]";
	}
	
	
}
