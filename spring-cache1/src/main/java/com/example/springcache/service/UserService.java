package com.example.springcache.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.example.springcache.domain.User;

@Service
public class UserService {
	
	@Cacheable(value = "User", key = "#id")
	public User getUserByID(String id,User user) {
		try {
			//if user doesn't exists in cache you will pass from here.
			//and it enters the user in cache for next time.
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return user;
		
	}
	
	@Cacheable(value = "User", key = "#id")
	public User isUserIDInCache(String id,User user) {
		try {
			//if user doesn't exists in cache you will pass from here.
			//and it enters the user in cache for next time.
			Thread.sleep(10);
			return new User();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return user;
		
	}
	
	
}
