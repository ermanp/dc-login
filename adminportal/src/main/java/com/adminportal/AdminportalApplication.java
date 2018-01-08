package com.adminportal;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.adminportal.domain.Product;
import com.adminportal.domain.User;
import com.adminportal.domain.security.Role;
import com.adminportal.domain.security.UserRole;
import com.adminportal.service.ProductService;
import com.adminportal.service.UserService;
import com.adminportal.utility.SecurityUtility;



@SpringBootApplication
public class AdminportalApplication implements CommandLineRunner{
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private ProductService productService;

	public static void main(String[] args) {
		SpringApplication.run(AdminportalApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		User user1 = new User();
		user1.setUsername("admin");
		user1.setPassword(SecurityUtility.passwordEncoder().encode("admin"));
		user1.setEmail("admin@gmail.com");
		Set<UserRole> userRoles = new HashSet<>();
		Role role1= new Role();
		role1.setRoleId(0);
		role1.setName("ROLE_ADMIN");
		userRoles.add(new UserRole(user1, role1));
		
		userService.createUser(user1, userRoles);
		
		
		User user2 = new User();
		user2.setUsername("erman");
		user1.setPassword(SecurityUtility.passwordEncoder().encode("erman"));
		user1.setEmail("erman@gmail.com");
		Set<UserRole> userRoles2 = new HashSet<>();
		Role role2= new Role();
		role1.setRoleId(1);
		role1.setName("ROLE_USER");
		userRoles.add(new UserRole(user2, role2));
		
		userService.createUser(user2, userRoles2);
		
		
		Product product1 = new Product();
		product1.setProductTitle("Product Title");
		product1.setProductPrice(12.00);
		
		productService.save(product1);
		
		Product product2 = new Product();
		product2.setProductTitle("Product Title2");
		product2.setProductPrice(12.00);
		
		productService.save(product2);
		
		
		
		List<Product> products = productService.findAll();
		
		
		for (Product product : products) {
			System.out.println("### " + product.getProductTitle());
		}
		
		
	}
}
