package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("Param2")
@Slf4j
public class ParamController {

	@PostMapping("test2")
	public String paramtest(@RequestParam("snackName")String snackName,
			@RequestParam("snackCompany")String snackCompany,
			@RequestParam("snackPrice")int snackPrice,
			@RequestParam(value="snackLike",defaultValue="snackLinke",required=false)String snackLike
			) {
		log.info(snackName);
		log.info(snackCompany);
		log.info("snackprice" + snackPrice);
		log.info(snackLike);
		
		return "redirect/param2/main";
	}
	
	
		
		


	
	}
	
	
	
	














