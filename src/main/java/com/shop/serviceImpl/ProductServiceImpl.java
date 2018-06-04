package com.shop.serviceImpl;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.dao.ProductMapper;
import com.shop.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
    Log log = LogFactory.getLog(this.getClass()); 
      
 	@Autowired
 	private ProductMapper productMapper;
 	
     /** 
      * 상품목록 총 카운트 
      * @param criteria 
      * @return 
      */ 
    @Override 
 	public int getProductListTotalCount(){ 
    		return productMapper.getProductListTotalCount(); 
 	} 

}
