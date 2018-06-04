package com.shop.model;

import java.util.Date;

import lombok.Data;

@Data
public class Product {
	/** 
	 * 상품 코드 
	 */ 
	private String prdtCode; 
	/** 
	 * 상품 한글명 
	 */ 
	private String prdtKorName; 
	/** 
	 * 상품 영문명 
	 */ 
	private String prdtEngName; 
	/** 
	 * 상품 판매가 
	 */ 
	private int prdtSellPrice; 
	/** 
	 * 상품 브랜드 아이디 
	 */ 
	private String prdtBrandId; 
	/** 
	 * 상품 전시여부 
	 */ 
	private String prdtDispYn; 
	/** 
	 * 상품 상세  
	 */ 
	private String prdtDetail;	 
	/** 
	 * 상품 등록자 
	 */ 
	private String prdtRegId; 
	/** 
	 * 상품 등록일 
	 */ 
	private Date prdtRegDt; 
	/** 
	 * 상품 수정자 
	 */ 
	private String prdtModId; 
	/** 
	 * 상품 수정일 
	 */ 
	private Date prdtModDt; 


	public static int seekOffset(int page, int size) {
		if (page > 0) {
			return (page - 1) * size;
		}
		return 0;
	}

	public static int seekStart(int page, int size) {
		System.out.println("start = " + (((page - 1) * size) + 1));
		return ((page - 1) * size) + 1;
	}

	public static int seekEnd(int page, int size) {
		System.out.println("end = " + page * size);
		return page * size;
	}
	
}
