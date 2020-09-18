package com.huutin.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.huutin.entity.UserEntity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


@Repository
@Transactional(readOnly = true)
public class UserRepositoryImpl implements UserRepositoryCustom {
    @PersistenceContext
    EntityManager entityManager;
  
	@Override
	public UserEntity getUserByEmail(String email) {
		try {
		 Query query = entityManager.createNativeQuery("SELECT em.* FROM vegshop.user as em " +
	                "WHERE em.email LIKE ?", UserEntity.class);
	        query.setParameter(1, email + "%");
	        return (UserEntity) query.getSingleResult();
	    }catch(Exception e){
	    	System.out.println("loi khong tim thay email");
	    	return null;
	    }
}

	
}

