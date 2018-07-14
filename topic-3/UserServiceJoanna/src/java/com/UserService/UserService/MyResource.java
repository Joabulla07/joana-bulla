package com.UserService.UserService;

import com.UserService.UserService.User;
import com.UserService.UserService.User;
import com.UserService.UserService.UserService;
import com.UserService.UserService.UserService;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;



@Path("user")
public class MyResource {
	
    UserService userService = new UserService();
  
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List <User> showAllUsers() {
        return userService.getUsers();
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{userId}")
    public User getUser(@PathParam("userId") long userId){
    	return userService.getUser(userId);
    }
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public User addUser(User user){
    	return userService.addUser(user);
    }
    
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/{userId}")
    public User updateUser(@PathParam("userId") long userId, User user){
    	user.setId(userId);
    	return userService.updateUser(user);
    }
    
    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{userId}")
    public User deleteUser(@PathParam("userId") long userId){
    	return userService.deleteUser(userId);
    }
    
    
}