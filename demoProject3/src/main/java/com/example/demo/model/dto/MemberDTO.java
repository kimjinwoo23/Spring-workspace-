package com.example.demo.model.dto;


import lombok.Getter;
import lombok.Setter;

/*
 getter 와 setter 는 Lombok 라이브러리 활용해서
 길게 작성하지않음 
 기본생성자

 */
@Getter
@Setter 
public class MemberDTO {
	//나중에 데이터베이스와 연결할 모델들 작성 
	private String memberid;
	private String memberpw;
	private String membername;
	private int memberAge;
	
	
	//기본생성자 -> lombok @NoArgsConstructor 자동완성사용
	//필수생성자 -> lombok @AllArgsConstructor 자동완성사용
	//toString -> lombok@ToString 자동완성 사용하기 
	
}
