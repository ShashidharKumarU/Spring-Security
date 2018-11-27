package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.User;
import com.example.demo.service.UserServiceImpl;

@Controller
public class UserController {

		@RequestMapping(value="/login",method=RequestMethod.GET)
		public String login(@RequestParam(name="username") String username, @RequestParam(name="password") String password) {
			System.out.println("username : "+username);
			System.out.println("password : "+password);
			List<User> userList = new ArrayList<User>();
			userList= new UserServiceImpl().findAllUsers();
			for(User user:userList) {
				System.out.println(user);
			}
			return "/allusers";
		}
		
		@RequestMapping(value="/index")
		public String index() {
			
			return "index";
		}
}
