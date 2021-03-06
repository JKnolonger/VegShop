package com.huutin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.huutin.converter.UserConverter;
import com.huutin.dto.User;
import com.huutin.entity.UserEntity;
import com.huutin.repository.UserRepository;

@Service
public class UserServices {
	
@Autowired
private UserRepository userRepo;

@Autowired
private UserConverter userConverter;

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

	@Transactional
	public UserEntity save(User user) {
		UserEntity userEntity = new UserEntity();
		String pass=passwordEncoder.encode(user.getPassword());
		userEntity = userConverter.toEntity(user,pass);
		return userRepo.save(userEntity);
	}
	 public List<UserEntity> listAll(String keyword) {
	        if (keyword != null) {
	            return userRepo.search(keyword);
	        }
	        return userRepo.findAll();
	     
	}
}
