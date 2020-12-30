package com.jpa.springboot.repository;

import com.jpa.springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

//继承JpaRepository来完成数据库操作
public interface UserRepository extends JpaRepository<User, Integer> {
}
