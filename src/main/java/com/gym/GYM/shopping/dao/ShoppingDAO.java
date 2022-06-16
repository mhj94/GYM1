package com.gym.GYM.shopping.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.gym.GYM.shopping.dto.WishDTO;

@Mapper
public interface ShoppingDAO {

	WishDTO wishdtoList(String memberId);

	
}