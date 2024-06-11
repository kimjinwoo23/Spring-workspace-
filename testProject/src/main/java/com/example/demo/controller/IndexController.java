package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("test")
	public String 테스트페이지연결메서드() {
		System.out.println("test 페이지로 연결확인");
		//src/main/resources/templates/test.html로 이동한다는 표시
		return "test";
		
	}
}
