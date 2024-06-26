package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.dto.Member;
import com.example.demo.service.MemberService;

@Controller
public class MemberController {
@Autowired
private MemberService memberService;
	
	//회원가입을 위해 작성할 GetMapping작성하기
	@GetMapping("/")
	public String registerFrom(Model model) {
		model.addAttribute("mem", new Member());
		return "index";
	}
	//나중에 회원가입을 완료하면 보일 PostMapping
	@PostMapping("/register")
	public String 회원가입완료(Member member, Model model) {
		//회원가입 작성이 완료가 되면 db에 저장하겠다.
		//마찬가지로 멤버가입으로 작성한 메서드기능 호출명을 insertMember 로 변경해줌
		memberService.insertMember(member);
		System.out.println("point 위치");
		//model.addattribute("select로 db에 저장된 회원가입정보 가져오기)
		model.addAttribute("msg","맴버가 성공적으로 가입되었습니다");
		return "success";
		
	}

	
}
