package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 Java 객체 : new 연산자에 의해 heap영역에 클래스에서 작성된
 내용대로 생성된 것 
 
 instance : 개발자가 만들고 관리하는 객체 
 
 bean : Spring Container(Spring)가 만들고 관리하는 객체 
 */
@Controller//요청이나 응답을 제어할 컨트롤러 역활 명시 
			//bean으로 등록(=객체로 생성해서 스프링이관리)
public class HelloController {
	//기존 servlet : 클래스단위로 하나의요청만 가능 
	//Spring :메서드 단위로 요청처리가능 
	//@RequestMapping("요청주소")
	//-요청주소를 처리할 메서드를 매핑하는 어노테이션
	
	//1) 메서드에 작성 : 
	// 요청주소와 메서드를 매핑
	//-GET / POST 가지않고 매핑 (속성을 통해 지정가능)
	
	//2) 클래스에 작성 : 
	// 공통적으로 사용되는 주소는 한 번에 매핑 
	//ex) 네이버/쇼핑 , 네이버/블로그,네이버/카페
	
	//@requestMappring("네이버")
	//public class 클래스명 { 
	
	//@RequestMapping("블로그")
	//public String 메서드명() {} 네이버/블로그매핑
	
	
	//@RequestMapping("카페")
		//public String 메서드명() {} 네이버/카페매핑
	
	
	//}

	@RequestMapping("/test") //test요청시 처리할 메서드 매핑
	public String testMethod() {
		System.out.println("/test요청받았는지확인");
		return "test";
	
	
}
}
