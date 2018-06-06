package com.rest.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.rest.dao.bean.Shop;
import com.rest.dao.mapper.ShopMapper;

@Service("service")
public class DemoService {

	@Resource
	private ShopMapper shopMapper;
	
	public Shop getShop(String name) {
		// TODO Auto-generated method stub
		return shopMapper.getShop(name);
	}

	public int addShop(Shop shop) {
		// TODO Auto-generated method stub
		return (int) shopMapper.addShop(shop);
	}

	
}
