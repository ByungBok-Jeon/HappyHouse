package com.ssafy.happyhouse.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.happyhouse.dto.HouseRent;

@Mapper
public interface HouseRentDAO {
	public List<HouseRent> selectAllHouseRent();
	public List<HouseRent> selectAllHouseRentByDong(String dongcode, String sigungucode);
	public List<HouseRent> selectAptRent();
	public List<HouseRent> selectAptRentByDong(String dongcode, String sigungucode);
	public List<HouseRent> selectRowHouseRent();
	public List<HouseRent> selectRowHouseRentByDong(String dongcode, String sigungucode);
	public List<HouseRent> selectDetachedHouseRent();
	public List<HouseRent> selectDetachedHouseRentByDong(String dongcode, String sigungucode);
	public List<HouseRent> selcetOfficetelRent();
	public List<HouseRent> selcetOfficetelRentByDong(String dongcode, String sigungucode);
}
