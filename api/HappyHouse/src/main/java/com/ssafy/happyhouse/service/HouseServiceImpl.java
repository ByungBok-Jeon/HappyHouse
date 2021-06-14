package com.ssafy.happyhouse.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.happyhouse.dao.HouseDAO;
import com.ssafy.happyhouse.dto.House;


@Service
public class HouseServiceImpl implements HouseService {
	
    @Autowired
    private HouseDAO houseDao;

	@Override
	public List<House> selectAllHouse() {
		return houseDao.selectAllHouse();
	}
	
	@Override
	public List<House> selectAllHouseByDong(String dongcode) {
		return houseDao.selectAllHouseByDong(dongcode);
	}

	@Override
	public List<House> selectApt() {
		return houseDao.selectApt();
	}

	@Override
	public List<House> selectAptByDong(String dongcode) {
		return houseDao.selectAptByDong(dongcode);
	}

	@Override
	public List<House> selectRowHouse() {
		return houseDao.selectRowHouse();
	}

	@Override
	public List<House> selectRowHouseByDong(String dongcode) {
		return houseDao.selectRowHouseByDong(dongcode);
	}

	@Override
	public List<House> selectDetachedHouse() {
		return houseDao.selectDetachedHouse();
	}

	@Override
	public List<House> selectDetachedHouseByDong(String dongcode) {
		return houseDao.selectDetachedHouseByDong(dongcode);
	}

	@Override
	public List<House> selcetOfficetel() {
		return houseDao.selcetOfficetel();
	}

	@Override
	public List<House> selcetOfficetelByDong(String dongcode) {
		return houseDao.selcetOfficetelByDong(dongcode);
	}
}