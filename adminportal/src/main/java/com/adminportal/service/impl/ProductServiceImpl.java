package com.adminportal.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adminportal.domain.Product;
import com.adminportal.domain.User;
import com.adminportal.repository.ProductRepository;
import com.adminportal.repository.UserRepository;
import com.adminportal.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public Product save(Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return (List<Product>) productRepository.findAll();
	}

	@Override
	public Product findOne(Long id) {
		// TODO Auto-generated method stub
		return productRepository.findOne(id);
	}

	@Override
	public void removeOne(Long id) {
		// TODO Auto-generated method stub
		productRepository.delete(id);
		
	}


	

}
