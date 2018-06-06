package com.rest.dao.mapper;

import com.rest.dao.bean.Shop;

public interface ShopMapper {

	Shop getShop(String name);

	int addShop(Shop shop);

}
