package com.example.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.shop.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@ModelAttribute("active")
	public String active(){
		return "product";
	}
	
	@GetMapping()
	public ModelAndView getProductsView(
			@RequestParam(name="page", required=false, defaultValue="1") int page,
			@RequestParam(name="size", required=false, defaultValue="10") int size,
			@RequestParam(name="bsize", required=false, defaultValue="5") int bsize) {
		ModelAndView mav = new ModelAndView("/product/product_list");
		mav.addObject("count", productService.getProductListTotalCount());
		return mav;
	}
	
}
