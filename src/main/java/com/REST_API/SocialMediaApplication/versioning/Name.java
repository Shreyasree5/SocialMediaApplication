package com.REST_API.SocialMediaApplication.versioning;

public class Name {
	
	private String FirstName;
	private String SecondName;
	
	public Name(String firstName, String secondName) {
		super();
		FirstName = firstName;
		SecondName = secondName;
	}

	public String getFirstName() {
		return FirstName;
	}

	public String getSecondName() {
		return SecondName;
	}	
	
	@Override
	public String toString() {
		return "Name [FirstName=" + FirstName + ", SecondName=" + SecondName + "]";
	}

}
