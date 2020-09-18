package com.huutin.repository;

import com.huutin.entity.UserEntity;

public interface UserRepositoryCustom {
UserEntity getUserByEmail(String email);

}
