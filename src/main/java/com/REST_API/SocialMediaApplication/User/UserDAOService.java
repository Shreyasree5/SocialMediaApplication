package com.REST_API.SocialMediaApplication.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDAOService {
	
	private static List<User> users = new ArrayList<>();
	
	private static int userCount=0;
	
	static {
		users.add(new User(++userCount, "Shreya", LocalDate.now().minusYears(25)));
		users.add(new User(++userCount, "Dinnu", LocalDate.now().minusYears(27)));
		users.add(new User(++userCount, "Jiju", LocalDate.now().minusYears(32)));	
	}
	
	public List<User> findAll(){
		return users;	
	}

	public User findOne(int id) {
		Predicate<? super User> predicate = user -> user.getId().equals(id); 
		return users.stream().filter(predicate).findFirst().orElse(null);
	}

	public User save(User u) {
		u.setId(++userCount);
		users.add(u);
		return u;
		
	}

	public void deleteById(int id) {
		Predicate<? super User> predicate = user -> user.getId().equals(id);
		users.removeIf(predicate);
		
	}

}
