package com.ssafy.happyhouse.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.happyhouse.dto.House;
import com.ssafy.happyhouse.service.HouseService;

import io.swagger.annotations.ApiOperation;

//http://localhost:8988/happyhouse/swagger-ui.html
@CrossOrigin(origins = { "*" }, maxAge = 6000)
@RestController
@RequestMapping("/api/house")
public class HouseController {

	private static final Logger logger = LoggerFactory.getLogger(HouseController.class);
	@Autowired
	private HouseService houseService;

    @ApiOperation(value = "모든 매매 매물의 정보를 반환한다.", response = List.class)
    @RequestMapping(value = "/selectAllHouse", method = RequestMethod.GET)
	public ResponseEntity<List<House>> selectAllHouse() throws Exception {
		logger.debug("selectAllHouse - 호출");
		return new ResponseEntity<List<House>>(houseService.selectAllHouse(), HttpStatus.OK);
	}
    @ApiOperation(value = "해당 동의 모든 매매 매물의 정보를 반환한다.", response = List.class)
    @RequestMapping(value = "/selectAllHouseByDong/{dongcode}", method = RequestMethod.GET)
	public ResponseEntity<List<House>> selectAllHouseByDong(@PathVariable String dongcode) throws Exception {
		logger.debug("selectAllHouseByDong - 호출");
		return new ResponseEntity<List<House>>(houseService.selectAllHouseByDong(dongcode), HttpStatus.OK);
	}
    
    @ApiOperation(value = "아파트 매매 매물의 정보를 반환한다.", response = List.class)
    @RequestMapping(value = "/selectApt", method = RequestMethod.GET)
	public ResponseEntity<List<House>> selectApt() throws Exception {
		logger.debug("selectApt - 호출");
		return new ResponseEntity<List<House>>(houseService.selectApt(), HttpStatus.OK);
	}
    
    @ApiOperation(value = "해당 동의 아파트 매매 매물의 정보를 반환한다.", response = List.class)
    @RequestMapping(value = "/selectAptByDong/{dongcode}", method = RequestMethod.GET)
	public ResponseEntity<List<House>> selectAptByDong(@PathVariable String dongcode) throws Exception {
		logger.debug("selectAptByDong - 호출");
		return new ResponseEntity<List<House>>(houseService.selectAptByDong(dongcode), HttpStatus.OK);
	}
    
    @ApiOperation(value = "연립주택 매매 매물의 정보를 반환한다.", response = List.class)
    @RequestMapping(value = "/selectRowHouse", method = RequestMethod.GET)
	public ResponseEntity<List<House>> selectRowHouse() throws Exception {
		logger.debug("selectRowHouse - 호출");
		return new ResponseEntity<List<House>>(houseService.selectRowHouse(), HttpStatus.OK);
	}
    
    @ApiOperation(value = "해당 동의 연립주택 매매 매물의 정보를 반환한다.", response = List.class)
    @RequestMapping(value = "/selectRowHouseByDong/{dongcode}", method = RequestMethod.GET)
	public ResponseEntity<List<House>> selectRowHouseByDong(@PathVariable String dongcode) throws Exception {
		logger.debug("selectRowHouseByDong - 호출");
		return new ResponseEntity<List<House>>(houseService.selectRowHouseByDong(dongcode), HttpStatus.OK);
	}
    
    @ApiOperation(value = "단독주택 매매 매물의 정보를 반환한다.", response = List.class)
    @RequestMapping(value = "/selectDetachedHouse", method = RequestMethod.GET)
	public ResponseEntity<List<House>> selectDetachedHouse() throws Exception {
		logger.debug("selectDetachedHouse - 호출");
		return new ResponseEntity<List<House>>(houseService.selectDetachedHouse(), HttpStatus.OK);
	}
    
    @ApiOperation(value = "해당 동의 단독주택 매매 매물의 정보를 반환한다.", response = List.class)
    @RequestMapping(value = "/selectDetachedHouseByDong/{dongcode}", method = RequestMethod.GET)
	public ResponseEntity<List<House>> selectDetachedHouseByDong(@PathVariable String dongcode) throws Exception {
		logger.debug("selectDetachedHouseByDong - 호출");
		return new ResponseEntity<List<House>>(houseService.selectDetachedHouseByDong(dongcode), HttpStatus.OK);
	}
    
    @ApiOperation(value = "오피스텔 매매 매물의 정보를 반환한다.", response = List.class)
    @RequestMapping(value = "/selectOfficetel", method = RequestMethod.GET)
   	public ResponseEntity<List<House>> selectselcetOfficetel() throws Exception {
   		logger.debug("selcetOfficetel - 호출");
   		return new ResponseEntity<List<House>>(houseService.selcetOfficetel(), HttpStatus.OK);
   	}
    
    @ApiOperation(value = "해당 동의 오피스텔 매매 매물의 정보를 반환한다.", response = List.class)
    @RequestMapping(value = "/selectOfficetelByDong/{dongcode}", method = RequestMethod.GET)
   	public ResponseEntity<List<House>> selectselcetOfficetelByDong(@PathVariable String dongcode) throws Exception {
   		logger.debug("selcetOfficetelByDong - 호출");
   		return new ResponseEntity<List<House>>(houseService.selcetOfficetelByDong(dongcode), HttpStatus.OK);
   	}

}