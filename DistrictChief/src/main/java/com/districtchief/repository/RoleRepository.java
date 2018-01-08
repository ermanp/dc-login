package com.districtchief.repository;

import org.springframework.data.repository.CrudRepository;

import com.districtchief.domain.security.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {
	Role findByname(String name);
}
