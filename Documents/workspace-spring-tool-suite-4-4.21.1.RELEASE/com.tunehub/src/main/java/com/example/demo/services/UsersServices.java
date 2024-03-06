package com.example.demo.services;

import org.apache.catalina.User;

import com.example.demo.entities.Users;

public interface UsersServices {
	public String addUsers(Users user);

	public boolean emailExits(String email);

	public boolean validateUser(String email, String password);

	public String getRole(String email);
	
	public Users getUsers(String email);
	
	public void updateUser(Users user);

}
