package com.ssafy.happyhouse.service;

import java.util.List;

import com.ssafy.happyhouse.dto.Code;


public interface CodeService {
	public List<Code> selectAllHouseCode();
	public List<Code> selectAllHouseRentCode();
	public List<Code> selectSigunguCode();
	public List<Code> selectHouseDongCode(String sigungucode);
	public List<Code> selectHouseRentDongCode(String sigungucode);
}
