package com.adminportal.service;

import java.util.List;
import java.util.Set;

import com.adminportal.domain.Product;
import com.adminportal.domain.User;
import com.adminportal.domain.security.UserRole;

public interface ProductService {
	
	
	Product save(Product product);
	
	List<Product> findAll();
	
	Product findOne(Long id);
	
	void removeOne(Long id);

}
