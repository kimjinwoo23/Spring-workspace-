package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.dto.Goods;

//Mapper.xml에 작성한id리스트를 모두 리스트만 작성하는공간
//interface로 작성 
//mapper.xml에 이런 파일이 존재한다.존재하는 리스트 작성란
//@Mapper 라는 어노테이션을 활용해서 SpringBoot가 Mapper를 찾을수있도록 설정 
@Mapper
public interface GoodsMapper {

	void insertGoods(Goods goods);
		
	
	
	
	
	
	
	
	
}
