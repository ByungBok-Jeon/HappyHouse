package com.ssafy.happyhouse.service;

import java.util.List;

import com.ssafy.happyhouse.dto.HouseRent;


public interface HouseRentService {
	public List<HouseRent> selectAllHouseRent();
	public List<HouseRent> selectAllHouseRentByDong(String dongcode,String sigungucode);
	public List<HouseRent> selectAptRent();
	public List<HouseRent> selectAptRentByDong(String dongcode, String sigungucode);
	public List<HouseRent> selectRowHouseRent();
	public List<HouseRent> selectRowHouseRentByDong(String dongcode, String sigungucode);
	public List<HouseRent> selectDetachedHouseRent();
	public List<HouseRent> selectDetachedHouseRentByDong(String dongcode, String sigungucode);
	public List<HouseRent> selcetOfficetelRent();
	public List<HouseRent> selcetOfficetelRentByDong(String dongcode, String sigungucode);
}
