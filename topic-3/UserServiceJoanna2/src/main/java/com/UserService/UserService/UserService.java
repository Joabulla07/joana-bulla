
package com.UserService.UserService;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class UserService {
	private Map<Long, User> users = UserRepository.getUsers();
	

	public List<User> getUsers(){
		return new ArrayList<User>(users.values());
	}
	
	public User getUser(long id){
		return users.get(id);
	}
	
	public User addUser(User user){
		users.put(user.getId(), user);
		return user;
	}
	
	public User deleteUser(long id){
		if(users.containsKey(id)){
			User dUser = users.get(id);
			users.remove(id);
			return dUser;
		}
		return null;
	}
	
	public User updateUser(User user){
		if(user.getId()<=0)
			return null;
		else{
			users.put(user.getId(), user);
			return user;
		}
	}
	
	
}