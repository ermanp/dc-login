package com.districtchief.service;

import java.util.Set;

import com.districtchief.domain.User;
import com.districtchief.domain.security.PasswordResetToken;
import com.districtchief.domain.security.UserRole;

public interface UserService {
	PasswordResetToken getPasswordResetToken(final String token);
	
	void createPasswordResetTokenForUser(final User user, final String token);

	User findByUsername(String username);

	User findByEmail(String userEmail);
	
	User createUser(User user, Set<UserRole> userRoles) throws Exception;
	
	User save(User user);

}
