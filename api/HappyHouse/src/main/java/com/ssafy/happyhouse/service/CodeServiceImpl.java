package com.ssafy.happyhouse.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.happyhouse.dao.CodeDAO;
import com.ssafy.happyhouse.dto.Code;


@Service
public class CodeServiceImpl implements CodeService {
	
    @Autowired
    private CodeDAO codeDao;

	@Override
	public List<Code> selectAllHouseCode() {
		return codeDao.selectAllHouseCode();
	}

	@Override
	public List<Code> selectAllHouseRentCode() {
		return codeDao.selectAllHouseRentCode();
	}

	@Override
	public List<Code> selectSigunguCode() {
		return codeDao.selectSigunguCode();
	}

	@Override
	public List<Code> selectHouseDongCode(String sigungucode) {
		return codeDao.selectHouseDongCode(sigungucode);
	}
	
	@Override
	public List<Code> selectHouseRentDongCode(String sigungucode) {
		return codeDao.selectHouseRentDongCode(sigungucode);
	}
    
}