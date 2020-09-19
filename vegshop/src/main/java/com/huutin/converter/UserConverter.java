package com.huutin.converter;

import org.springframework.stereotype.Component;

import com.huutin.dto.User;
import com.huutin.entity.UserEntity;
@Component
public class UserConverter {
	
	public UserEntity toEntity(User user,String pass) {
		UserEntity result = new UserEntity();
		result.setFullName(user.getFullName());
		result.setUserName(user.getUserName());
		result.setPassword(pass);
		result.setPhone(user.getPhone());
		result.setEmail(user.getEmail());
		result.setStatus(1);
		return result;
	}
}
