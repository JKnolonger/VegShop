package com.huutin.controller.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.huutin.dto.User;
import com.huutin.service.impl.UserServices;


@Controller
public class UserController {
	@Autowired
	private UserServices userService;
	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public ModelAndView registerUser(@RequestParam("fullName") String name,@RequestParam("userName")String userName,@RequestParam("password")String password,@RequestParam("email") String email,@RequestParam("phone") String phone) {
		User user = new User();
		user.setFullName(name);
		user.setUserName(userName);
		user.setPassword(password);
		user.setEmail(email);
		user.setPhone(phone);
		userService.save(user);
		ModelAndView mav = new ModelAndView("web/home");
		return mav;
	}
	  
	}
