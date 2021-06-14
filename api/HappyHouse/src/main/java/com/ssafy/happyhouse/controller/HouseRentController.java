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

import com.ssafy.happyhouse.dto.HouseRent;
import com.ssafy.happyhouse.service.HouseRentService;

import io.swagger.annotations.ApiOperation;

//http://localhost:8988/happyhouse/swagger-ui.html
@CrossOrigin(origins = { "*" }, maxAge = 6000)
@RestController
@RequestMapping("/api/houserent")
public class HouseRentController {

	private static final Logger logger = LoggerFactory.getLogger(HouseRentController.class);

	@Autowired
	private HouseRentService houserentService;

    @ApiOperation(value = "모든 전월세 매물의 정보를 반환한다.", response = List.class)
    @RequestMapping(value = "/selectAllHouseRent", method = RequestMethod.GET)
	public ResponseEntity<List<HouseRent>> selectAllHouseRent() throws Exception {
		logger.debug("selectAllHouseRent - 호출");
		return new ResponseEntity<List<HouseRent>>(houserentService.selectAllHouseRent(), HttpStatus.OK);
	}
    @ApiOperation(value = "해당 동의 모든 전월세 매물의 정보를 반환한다.", response = List.class)
    @RequestMapping(value = "/selectAllHouseRentByDong/{dongcode}/{sigungucode}", method = RequestMethod.GET)
	public ResponseEntity<List<HouseRent>> selectAllHouseRentByDong(@PathVariable String dongcode, @PathVariable String sigungucode) throws Exception {
		logger.debug("selectAllHouseRentByDong - 호출");
		return new ResponseEntity<List<HouseRent>>(houserentService.selectAllHouseRentByDong(dongcode,sigungucode), HttpStatus.OK);
	}
    
    @ApiOperation(value = "아파트 전월세 매물의 정보를 반환한다.", response = List.class)
    @RequestMapping(value = "/selectAptRent", method = RequestMethod.GET)
	public ResponseEntity<List<HouseRent>> selectAptRent() throws Exception {
		logger.debug("selectAptRent - 호출");
		return new ResponseEntity<List<HouseRent>>(houserentService.selectAptRent(), HttpStatus.OK);
	}
    
    @ApiOperation(value = "해당 동의 아파트 전월세 매물의 정보를 반환한다.", response = List.class)
    @RequestMapping(value = "/selectAptRentByDong/{dongcode}/{sigungucode}", method = RequestMethod.GET)
	public ResponseEntity<List<HouseRent>> selectAptRentByDong(@PathVariable String dongcode, @PathVariable String sigungucode) throws Exception {
		logger.debug("selectAptRentByDong - 호출");
		return new ResponseEntity<List<HouseRent>>(houserentService.selectAptRentByDong(dongcode,sigungucode), HttpStatus.OK);
	}
    
    @ApiOperation(value = "연립주택 전월세 매물의 정보를 반환한다.", response = List.class)
    @RequestMapping(value = "/selectRowHouseRent", method = RequestMethod.GET)
	public ResponseEntity<List<HouseRent>> selectRowHouseRent() throws Exception {
		logger.debug("selectRowHouseRent - 호출");
		return new ResponseEntity<List<HouseRent>>(houserentService.selectRowHouseRent(), HttpStatus.OK);
	}
    
    @ApiOperation(value = "해당 동의 연립주택 전월세 매물의 정보를 반환한다.", response = List.class)
    @RequestMapping(value = "/selectRowHouseRentByDong/{dongcode}/{sigungucode}", method = RequestMethod.GET)
	public ResponseEntity<List<HouseRent>> selectRowHouseRentByDong(@PathVariable String dongcode, @PathVariable String sigungucode) throws Exception {
		logger.debug("selectRowHouseRentByDong - 호출");
		return new ResponseEntity<List<HouseRent>>(houserentService.selectRowHouseRentByDong(dongcode,sigungucode), HttpStatus.OK);
	}
    
    @ApiOperation(value = "단독주택 전월세 매물의 정보를 반환한다.", response = List.class)
    @RequestMapping(value = "/selectDetachedHouseRent", method = RequestMethod.GET)
	public ResponseEntity<List<HouseRent>> selectDetachedHouseRent() throws Exception {
		logger.debug("selectDetachedHouseRent - 호출");
		return new ResponseEntity<List<HouseRent>>(houserentService.selectDetachedHouseRent(), HttpStatus.OK);
	}
    
    @ApiOperation(value = "해당 동의 단독주택 전월세 매물의 정보를 반환한다.", response = List.class)
    @RequestMapping(value = "/selectDetachedHouseRentByDong/{dongcode}/{sigungucode}", method = RequestMethod.GET)
	public ResponseEntity<List<HouseRent>> selectDetachedHouseRentByDong(@PathVariable String dongcode, @PathVariable String sigungucode) throws Exception {
		logger.debug("selectDetachedHouseRentByDong - 호출");
		return new ResponseEntity<List<HouseRent>>(houserentService.selectDetachedHouseRentByDong(dongcode,sigungucode), HttpStatus.OK);
	}
    
    @ApiOperation(value = "오피스텔 전월세 매물의 정보를 반환한다.", response = List.class)
    @RequestMapping(value = "/selcetOfficetelRent", method = RequestMethod.GET)
   	public ResponseEntity<List<HouseRent>> selectselcetOfficetelRent() throws Exception {
   		logger.debug("selcetOfficetelRent - 호출");
   		return new ResponseEntity<List<HouseRent>>(houserentService.selcetOfficetelRent(), HttpStatus.OK);
   	}
    
    @ApiOperation(value = "해당 동의 오피스텔 전월세 매물의 정보를 반환한다.", response = List.class)
    @RequestMapping(value = "/selcetOfficetelRentByDong/{dongcode}/{sigungucode}", method = RequestMethod.GET)
   	public ResponseEntity<List<HouseRent>> selectselcetOfficetelRentByDong(@PathVariable String dongcode, @PathVariable String sigungucode) throws Exception {
   		logger.debug("selcetOfficetelRentByDong - 호출");
   		return new ResponseEntity<List<HouseRent>>(houserentService.selcetOfficetelRentByDong(dongcode,sigungucode), HttpStatus.OK);
   	}

}