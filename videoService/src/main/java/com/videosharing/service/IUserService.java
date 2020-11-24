package com.videosharing.service;

import java.util.List;

import com.videosharing.api.dto.UserPayload;
import com.videosharing.model.User;

import javassist.NotFoundException;


public interface IUserService {
	List<User> findAll();

	User save(User userForSave);
    
	User getById(String userId) throws NotFoundException;

    void deleteById(String userId) throws NotFoundException;
    
    User addUser(UserPayload payload) throws NotFoundException;
    
    void updateBalance(String userId, double amount) throws NotFoundException, IllegalArgumentException;
}
