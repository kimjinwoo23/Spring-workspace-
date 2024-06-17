package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class Goods {
	private int goodsId;
	private String goods_name;
	private int goods_price;
	private int goods_quantity;
	
	
}
