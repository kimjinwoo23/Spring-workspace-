package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;
@Slf4j //각 메서드 이동할때 마다 log.info로 위치이동확인
@Controller
public class IndexController {
	
	@GetMapping("cafe/cafe-index")
	public String cafeMainMethod() {
		log.info("cafe-index로 이동");
		return "cafe/cafe-index";
	}
	@GetMapping("blog/blog-index")
	public String blog() {
		log.info("blog-index로 이동");
		return "blog/blog-index";
	}
	@GetMapping("cafe/cafe-board")
	public String cafeborad() {
		log.info("cafe-board로 이동");
		return "cafe/cafe-board";
	}
		@GetMapping("blog/blog-board")
		public String blogborad() {
			log.info("blog-board로 이동");
			return "blog/blog-board";
	
		}
	
	
	
}
