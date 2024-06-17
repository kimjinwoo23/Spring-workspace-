package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.Goods;
import com.example.demo.mapper.GoodsMapper;

@Service
public class GoodsService {
	@Autowired
	private GoodsMapper goodsMapper;
	
	public void insertGoods(Goods goods) {
		goodsMapper.insertGoods(goods);
	}

	
	
	
	
	
	
}
