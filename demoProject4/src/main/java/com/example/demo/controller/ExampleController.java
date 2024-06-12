package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;

@Controller//요청하거나 응답제어 역활을 명시bean등록
//bean =Spting 에서 어떤기능을 하라고 설정한 값 example로시작하는 주소를 컨트롤러에 작성
@RequestMapping("example")//lombok 라이브러리가 제공하는 로그 객체 자동생성 어노테이션
@Slf4j
public class ExampleController {
	/*
	 Model : Spring 에서 데이터 전달역활을 하는 객체
	 -org.springframework.ui 패키지
	 @SessionAttributes와 함께 사용할경우 session scope반환
	 -기본 사용법 
	 Model.addAttribute("key","value");
	 
	 
	 */
	
	
	
	@GetMapping("ex1")//example/ex1주소로 보여지는값
	public String ex1(HttpServletRequest req, Model model) {
		req.setAttribute("test1", "HttpServletRequest로 전달한 값");
		model.addAttribute("test2","Model로 전달한 값");
		
		return "example/ex1";//templats/example/ex.1html파일을 바라보는것
	}
	
	
}



















