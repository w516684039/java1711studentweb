package com.situ.mall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.situ.mall.common.ServerResponse;
import com.situ.mall.entity.Product;
import com.situ.mall.mapper.ProductMapper;
import com.situ.mall.service.IProductService;
@Service
public class ProductServiceImpl implements IProductService {
	
	@Autowired
	private ProductMapper productMapper;
	
	@Override
	public ServerResponse<List<Product>> pageList(Integer page, Integer limit) {
		PageHelper.startPage(page, limit);
		List<Product> list = productMapper.pageList();
		PageInfo pageInfo = new PageInfo(list);
		Integer count = (int)pageInfo.getTotal();
		return ServerResponse.createSuccess("查询成功",count,list);
	}

}
