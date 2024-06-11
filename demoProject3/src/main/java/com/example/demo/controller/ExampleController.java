package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExampleController {
	/*
	 요청주소 매핑하는 방법 
	 1)@RequestMapping("주소")
	 
	 2)@getMapping("주소") : GET(조희) 방식 요청 매핑 
	   @postMapping@("주소") : Post(삽입) 방식 요청 매핑
	   @PutMapping("주소") :PUT(수정)방식 요청 매핑 -form js a 태그 요청불가 
	   @DeleteMapping("주소"):DELETE(삭제)방식 요청 매핑 -form js a 태그 요청불가 	

	 */
@GetMapping("example")   //example로 get 방식 매핑요청
	public String exampleMethod() {
	return "example";
}
	
}
