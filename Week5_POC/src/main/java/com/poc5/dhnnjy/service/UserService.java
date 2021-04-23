package com.poc5.dhnnjy.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.poc5.dhnnjy.model.User;

public interface UserService {
	List<User> getAllUsers();
	void saveUser(User user);
	User getUserById(long id);
	void deleteUserById(long id);
	Page<User> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}

