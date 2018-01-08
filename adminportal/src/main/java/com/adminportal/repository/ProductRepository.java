package com.adminportal.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import com.adminportal.domain.Product;

public interface ProductRepository extends CrudRepository<Product, Long>{

}
