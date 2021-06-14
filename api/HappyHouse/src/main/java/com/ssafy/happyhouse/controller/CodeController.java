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

import com.ssafy.happyhouse.dto.Code;
import com.ssafy.happyhouse.service.CodeService;

import io.swagger.annotations.ApiOperation;

//http://localhost:8988/happyhouse/swagger-ui.html
@CrossOrigin(origins = { "*" }, maxAge = 6000)
@RestController
@RequestMapping("/api/code")
public class CodeController {

	private static final Logger logger = LoggerFactory.getLogger(CodeController.class);
	@Autowired
	private CodeService codeService;

    @ApiOperation(value = "매매에 사용되는 시군구,시군구코드,동,동코드를 반환한다.", response = List.class)
    @RequestMapping(value = "/selectAllHouseCode", method = RequestMethod.GET)
	public ResponseEntity<List<Code>> selectAllHouseCode() throws Exception {
		logger.debug("selectAllHouseCode - 호출");
		return new ResponseEntity<List<Code>>(codeService.selectAllHouseCode(), HttpStatus.OK);
	}
    
    @ApiOperation(value = "전월세에 사용되는 시군구,시군구코드,동,동코드를 반환한다.", response = List.class)
    @RequestMapping(value = "/selectAllHouseRentCode", method = RequestMethod.GET)
	public ResponseEntity<List<Code>> selectAllHouseRentCode() throws Exception {
		logger.debug("selectAllHouseRentCode - 호출");
		return new ResponseEntity<List<Code>>(codeService.selectAllHouseRentCode(), HttpStatus.OK);
	}
    
    @ApiOperation(value = "시군구,시군구코드를 반환한다.", response = List.class)
    @RequestMapping(value = "/selectSigunguCode", method = RequestMethod.GET)
	public ResponseEntity<List<Code>> selectSigunguCode() throws Exception {
		logger.debug("selectSigunguCode - 호출");
		return new ResponseEntity<List<Code>>(codeService.selectSigunguCode(), HttpStatus.OK);
	}
    
    @ApiOperation(value = "매매에서 시군구코드에 해당하는 동,동코드를 반환한다.", response = List.class)
    @RequestMapping(value = "/selectHouseDongCode/{sigungucode}", method = RequestMethod.GET)
	public ResponseEntity<List<Code>> selectHouseDongCode(@PathVariable String sigungucode) throws Exception {
		logger.debug("selectHouseDongCode - 호출");
		return new ResponseEntity<List<Code>>(codeService.selectHouseDongCode(sigungucode), HttpStatus.OK);
	}
    
    @ApiOperation(value = "전월세에서 시군구코드에 해당하는 동,동코드를 반환한다.", response = List.class)
    @RequestMapping(value = "/selectHouseRentDongCode/{sigungucode}", method = RequestMethod.GET)
	public ResponseEntity<List<Code>> selectHouseRentDongCode(@PathVariable String sigungucode) throws Exception {
		logger.debug("selectHouseRentDongCode - 호출");
		return new ResponseEntity<List<Code>>(codeService.selectHouseRentDongCode(sigungucode), HttpStatus.OK);
	}

}