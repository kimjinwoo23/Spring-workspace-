package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller //응답 / 요청 제어역확 명시 bean등록
@RequestMapping("param")//여기 밑에 작성하는 모든주소앞에 param이 기본으로 붙음
public class ParameterController {
	//GETMAPPING main
	
	@GetMapping("main") //param/main주소로 get 요청
	public String paramMain() {
		return "param/main";
	}
	@PostMapping("test1")
	public String paramTest1(HttpServletRequest req) {
		String inputName = req.getParameter("inputName");
		String inputAddress= req.getParameter("inputAddress");
		int inputAge=Integer.parseInt(req.getParameter("inputAge"));
		
		/*
		 spring에서 Redirect(재요청)하는방법
		 Controller 메서드 반환값에
		 redirect: 요청주소 작성
		 되돌아가짐 
		 
		 */
		return "redirect:param/main";
		
		
	}
	
	
}
