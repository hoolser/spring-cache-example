package com.example.springcache.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.springcache.domain.User;
import com.example.springcache.service.UserService;


@Controller
public class UserController {
	
	static int ID=1;
	
	@Autowired
	UserService userService;
	
	@GetMapping("/user/{Id}")
	public String findUserById(@PathVariable String Id, Model model) {	
		//this code check if user is in cache
		User u2;
		u2=userService.isUserIDInCache(Id, new User(Id,"-","-","-","-"));
		if(u2.getId().equalsIgnoreCase("-1")) {
			//System.out.println("This User there isn't in Cache.");
			return "errorUser";
		}else {
			//System.out.println("This User is in Cache: "+u2);
			model.addAttribute("Id",Id);
			model.addAttribute("name",u2.getName());
			model.addAttribute("surname",u2.getSurname());
			model.addAttribute("phone",u2.getPhone());
			model.addAttribute("email",u2.getEmail());
			return "userviewjson";
		}
	}
	
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@PostMapping("/hello")
	public String sayHello(@RequestParam("name")String name,@RequestParam("surname")String surname,@RequestParam("phone")String phone,@RequestParam("email")String email, Model model) {
		model.addAttribute("name",name);
		model.addAttribute("surname",surname);
		model.addAttribute("phone",phone);
		model.addAttribute("email",email);
		model.addAttribute("Id",ID);
		String IDstr=String.valueOf(ID);
		ID++;
		User u1 = new User(IDstr,name,surname,phone,email);
		//insert user in cache
		userService.getUserByID(IDstr,u1);
		return "hello";
	}
	
	@RequestMapping("/hello")
	public String getAtr() {
		return "hello";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@PostMapping("/userview")
	public String UserView(@RequestParam("Id")String Id, Model model) {
		model.addAttribute("Id",Id);

		//this code check if user is in cache
		User u2;
		u2=userService.isUserIDInCache(Id, new User(Id,"-","-","-","-"));
		if(u2.getId().equalsIgnoreCase("-1")) {
			//System.out.println("This User there isn't in Cache.");
			return "errorUser";
		}else {
			//System.out.println("This User is in Cache: "+u2);
			model.addAttribute("name",u2.getName());
			model.addAttribute("surname",u2.getSurname());
			model.addAttribute("phone",u2.getPhone());
			model.addAttribute("email",u2.getEmail());
			return "userview";
		}
		
		
	}
	
	@RequestMapping("/userview")
	public String getAtrUser() {
		return "userview";
	}
	
	
}
