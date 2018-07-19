
package com.UserService.UserService;


import java.util.HashMap;
import java.util.Map;


public class UserRepository {
	private static Map<Long,User> users = new HashMap<>() ;
	
	public static Map <Long,User> getUsers(){
		return users;
	}
}