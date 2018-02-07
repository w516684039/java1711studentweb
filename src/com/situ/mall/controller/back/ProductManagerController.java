package com.situ.mall.controller.back;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.situ.mall.common.ServerResponse;
import com.situ.mall.entity.Product;
import com.situ.mall.service.IProductService;

@Controller
@RequestMapping("/manager/product")
public class ProductManagerController {
	@Autowired
	private IProductService productService;
	
	@RequestMapping("/pageList")
	@ResponseBody
	public ServerResponse<List<Product>> pageList(Integer page, Integer limit) {
		return productService.pageList(page, limit);
	}
	
	@RequestMapping("/getProductPage")
	public String getProductPage() {
		return "product_list";
	}
}