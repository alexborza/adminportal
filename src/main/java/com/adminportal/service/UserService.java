package com.adminportal.service;

import java.util.Set;

import com.adminportal.model.User;
import com.adminportal.model.security.PasswordResetToken;
import com.adminportal.model.security.UserRole;

public interface UserService {
	User createUser(User user, Set<UserRole> userRoles) throws Exception;
	User save(User user);
}
