package com.ssafy.happyhouse.service;

import java.util.List;

import com.ssafy.happyhouse.dto.House;


public interface HouseService {
	public List<House> selectAllHouse();
	public List<House> selectAllHouseByDong(String dongcode);
	public List<House> selectApt();
	public List<House> selectAptByDong(String dongcode);
	public List<House> selectRowHouse();
	public List<House> selectRowHouseByDong(String dongcode);
	public List<House> selectDetachedHouse();
	public List<House> selectDetachedHouseByDong(String dongcode);
	public List<House> selcetOfficetel();
	public List<House> selcetOfficetelByDong(String dongcode);
}
