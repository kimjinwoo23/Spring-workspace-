package com.example.demo.dto;

import lombok.*;


@Getter
@Setter
@ToString
@NoArgsConstructor	//기본생성자
@AllArgsConstructor	//필수생성자
public class StudentDTO {

	private String StudentNo;
	private String Name;
	private int Age;
	
	
	
	
}
