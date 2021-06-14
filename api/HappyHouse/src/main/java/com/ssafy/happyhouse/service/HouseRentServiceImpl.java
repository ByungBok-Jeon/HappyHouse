package com.ssafy.happyhouse.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.happyhouse.dao.HouseRentDAO;
import com.ssafy.happyhouse.dto.HouseRent;


@Service
public class HouseRentServiceImpl implements HouseRentService {
	
    @Autowired
    private HouseRentDAO houserentDao;

	@Override
	public List<HouseRent> selectAllHouseRent() {
		return houserentDao.selectAllHouseRent();
	}
	
	@Override
	public List<HouseRent> selectAllHouseRentByDong(String dongcode,String sigungucode) {
		return houserentDao.selectAllHouseRentByDong(dongcode,sigungucode);
	}

	@Override
	public List<HouseRent> selectAptRent() {
		return houserentDao.selectAptRent();
	}

	@Override
	public List<HouseRent> selectAptRentByDong(String dongcode, String sigungucode) {
		return houserentDao.selectAptRentByDong(dongcode,sigungucode);
	}

	@Override
	public List<HouseRent> selectRowHouseRent() {
		return houserentDao.selectRowHouseRent();
	}

	@Override
	public List<HouseRent> selectRowHouseRentByDong(String dongcode, String sigungucode) {
		return houserentDao.selectRowHouseRentByDong(dongcode,sigungucode);
	}

	@Override
	public List<HouseRent> selectDetachedHouseRent() {
		return houserentDao.selectDetachedHouseRent();
	}

	@Override
	public List<HouseRent> selectDetachedHouseRentByDong(String dongcode, String sigungucode) {
		return houserentDao.selectDetachedHouseRentByDong(dongcode,sigungucode);
	}

	@Override
	public List<HouseRent> selcetOfficetelRent() {
		return houserentDao.selcetOfficetelRent();
	}

	@Override
	public List<HouseRent> selcetOfficetelRentByDong(String dongcode, String sigungucode) {
		return houserentDao.selcetOfficetelRentByDong(dongcode,sigungucode);
	}
}