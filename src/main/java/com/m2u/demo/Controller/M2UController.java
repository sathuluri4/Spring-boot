package com.m2u.demo.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.m2u.demo.model.User;


@RestController
public class M2UController {
	
	@GetMapping("/Welcome")
    public String Welcome(@RequestParam String userName) 
    {
		return "Hello " + userName +". Welcome to Spring Boot Application";
    }
	
	@PostMapping("/addUser")
	public ResponseEntity<User> InsertUser(@RequestBody User user ) {
		
		if(user==null) {
			user = new User();
			user.setUserName("Sathu");
			user.setUserID("123");
			user.setEmail("kk@gmail.com");
		}
		 return new ResponseEntity<User>(user,HttpStatus.OK);
	}
	
	@PostMapping("/addMultipleUser")
	public ResponseEntity<List> InsertUser(@RequestBody List<User> user ) {
		
		 return new ResponseEntity<List>(user,HttpStatus.OK);
	}

}
