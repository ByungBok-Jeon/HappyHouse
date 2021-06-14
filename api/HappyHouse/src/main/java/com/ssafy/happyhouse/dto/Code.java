package com.ssafy.happyhouse.dto;

public class Code {
	private String sigungucode;
	private String sigungu;
	private String dongcode;
	private String dong;
	
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
	@Override
	public String toString() {
		return "Code [sigungucode=" + sigungucode + ", sigungu=" + sigungu + ", dongcode=" + dongcode + ", dong=" + dong
				+ "]";
	}
	
	
	
	
}
