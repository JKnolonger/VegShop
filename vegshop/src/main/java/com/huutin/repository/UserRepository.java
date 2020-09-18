package com.huutin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.huutin.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long>,UserRepositoryCustom {
	UserEntity findOneByUserNameAndStatus(String name, int status);
	
}
