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
	
	/*
	 2.RequestParam - 낱개(한개 , 단수) 파라미터 얻어오기
	 -request 객체를 이용한 파라미터 전달 어노테이션 
	 -매개변수 앞에 해당 어노테이션을 작성하면 매개변수에 값이적용됨
	 -작성되는 데이터는 매겨변수 ( 파라미터)타입에맞게 형변환이(parse) 자동으로 수행
	 [속성 추가 작성법 ] 
	 @RequsetParam(value ="name", required="false, defaultvalue="1")
	 
	 value= 전달받은 input 태그의 name속성값
	  required : 입력된 name 속성값 파라미터(매개변수)필수여부 지정 (기본값 ture)
	   			->required = true인 파라미터가 존재하지않는다면 400 bad request 에러발생
	   			->required = true인 null인 경우에도 같은 에러발생
	 defaultValue = 파라미터중 일치하는 name 속성 값이 없을 경우 대입할 값 지정
	    		->required가 false일 경우 사용
	    		
	 //400 bad Request(잘못된 요청으로) 파라미터 불충분
	   	 */		
		@PostMapping("test2")
	  public String paramTest2(/*RequestParam 여기에 보통작성*/) {
		 
		  
		  return "redirect:/param/main";
	  }
	   			
	   			
	   			
	   			
	   			
	   			
	   			
	   			
	   			
	   			
	   			
	 
	 
	 
	
	
	
	
	
	
	
	
	
}
