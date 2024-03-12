package com.REST_API.SocialMediaApplication.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.REST_API.SocialMediaApplication.User.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
