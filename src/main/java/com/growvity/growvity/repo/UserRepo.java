package com.growvity.growvity.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.growvity.growvity.model.User;

public interface UserRepo  extends JpaRepository<User, Long> {
}
