package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.dto.Goods;
import com.example.demo.service.GoodsService;

@Controller
public class GoodsController {
	@GetMapping("/") //맨 앞페이지에서 볼 화면 띄우기
	public String registerForm(Model model) {
		//DB에 값을 넣을수있도로 new Goods()에 값을비워서  만들기
		model.addAttribute("goods", new Goods());
		return "index";
	}
	//GoodsService에 숫자값아니면 들어가지못하게 방지하거나 비밀번호 암호화 설정과같은 상세기능을 넣고
	//service를 호출해서 mapper java파일에 값을 전달할수있도록 작성해주기
	@Autowired
	private GoodsService goodsService;
	
	@PostMapping("/register")
	public String insertGoods(Goods goods , Model model) {
		/*
		 Goods goods HTML From에 name으로 시작하는 변수명이있으면 ,
		 Goods.java의 변수명과 Form에 적은 name값이일치할경우 
		 자동으로 Goods.java 라는 곳에 일치하는 변수명에 form에작성하는 값이 바로 
		 임시저장(할당해줌) 
		 Model model=돌아가기를 하거나 새로고침과 같은 기능을 사용할경우 
		 HTML 파일에 데이터를 다시 전달하는 역활(다른의미로 임시저장)
		 */
		
		goodsService.insertGoods(goods);
		//log 
		model.addAttribute("msg", "굿즈가 성공적으로 생성됨");
		return "registerSuccess";
		
		
	}
	
	
}









