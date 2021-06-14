package com.ssafy.happyhouse.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.happyhouse.dto.Code;

@Mapper
public interface CodeDAO {
	public List<Code> selectAllHouseCode();
	public List<Code> selectAllHouseRentCode();
	public List<Code> selectSigunguCode();
	public List<Code> selectHouseDongCode(String sigungucode);
	public List<Code> selectHouseRentDongCode(String sigungucode);
}
