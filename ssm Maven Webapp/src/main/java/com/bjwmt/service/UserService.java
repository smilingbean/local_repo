package com.bjwmt.service;


import com.bjwmt.model.User;
import java.util.List;

public interface UserService {
	User findUserByID(long userID);
	
	List<User> selectAll();

}
