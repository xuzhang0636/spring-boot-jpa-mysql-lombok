package com.xuzhang.springbootjpamysqllombok.repository;

import com.xuzhang.springbootjpamysqllombok.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
