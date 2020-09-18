package com.huutin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.huutin.entity.UserEntity;
import com.huutin.repository.UserRepository;

@Service
public class UserServices {
	
@Autowired
private UserRepository userRepo;
@Autowired
private PasswordEncoder passwordEncoder;

	public UserEntity findById(long id) {
		UserEntity userEntity = userRepo.findOne(id);
		return userEntity;
	}
	
	public void updatePassUser(long id,String pass) {
		UserEntity newU=findById(id);
		newU.setPassword(passwordEncoder.encode(pass));
		userRepo.save(newU);
	}
	
}
