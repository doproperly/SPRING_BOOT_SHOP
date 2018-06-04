package com.shop.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ProductMapper {
	@Select("SELECT COUNT(*) FROM SHOP_PRODUCT")
	public int getProductListTotalCount();
}
