package com.huutin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.huutin.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long>,UserRepositoryCustom {
	UserEntity findOneByUserNameAndStatus(String name, int status);
	
	 @Query(value="SELECT * FROM vegshop.user  WHERE username LIKE %?1%"
	            + " OR fullname LIKE %?1%"
	            + " OR email LIKE %?1%", nativeQuery = true)            
	   public  List<UserEntity> search(String keyword);
	
}
