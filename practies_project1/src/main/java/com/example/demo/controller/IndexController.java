package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class IndexController {
	//1. test 메서드를 이용해서 test.html로 이동하는지확인
	
	@RequestMapping("test")
	public String testMethod() {
		//-->log.info로 test 출력
		log.info("테스트 페이지 이동");
		return "test";
		
	}
	//홈페이지 이동하는 코드
	@RequestMapping("home")
	public String homeMethod() {
		log.info("홈페이지로 이동");
		return "index";
	}
	//RequestMapping에 작성한이름과 return에 작성한 이름이
	//달라도 괜찮음
	
	
}
