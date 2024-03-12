package com.REST_API.SocialMediaApplication.User;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;


@Entity(name = "user_details")
public class User {
	
	protected User() {
		
	}
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@Size(min = 2, message = "Name should have atleast 2 characters")
	//@JsonProperty("User Name")
	private String name;
	
	@Past(message = "DOB should be in past")
	private LocalDate DOB;
	
	@OneToMany(mappedBy = "user")
	@JsonIgnore
	private List<Post> posts;
	
	public User(Integer id, String name, LocalDate dOB) {
		super();
		this.id = id;
		this.name = name;
		DOB = dOB;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDOB() {
		return DOB;
	}

	public void setDOB(LocalDate dOB) {
		DOB = dOB;
	}

	public List<Post> getPost() {
		return posts;
	}

	public void setP(List<Post> p) {
		this.posts = p;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", DOB=" + DOB + "]";
	}
	
	

}
