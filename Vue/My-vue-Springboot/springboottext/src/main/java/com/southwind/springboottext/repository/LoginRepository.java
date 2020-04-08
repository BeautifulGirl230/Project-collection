package com.southwind.springboottext.repository;

import com.southwind.springboottext.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository<User,Integer> {
}
