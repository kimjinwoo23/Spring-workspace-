package com.example.demo.controller.blog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//Controller 폴더밑에 blog 라는 폴더를만들어서 블로그관련 컨트롤러 작성
@Controller
@RequestMapping("blog")
public class BlogController {
	@GetMapping("index")
	public String blogMainMethod() {
		return "blog/blog-index";
	}
		@GetMapping("board")
		public String blogboardMethod() {
			return "blog/blog-board";
		
	}
	
	
	
}
