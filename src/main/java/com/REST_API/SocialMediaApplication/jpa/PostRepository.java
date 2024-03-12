package com.REST_API.SocialMediaApplication.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.REST_API.SocialMediaApplication.User.Post;

public interface PostRepository extends JpaRepository<Post, Integer>{

}
