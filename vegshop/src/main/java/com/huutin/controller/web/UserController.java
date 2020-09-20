package com.huutin.controller.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.huutin.dto.User;
import com.huutin.entity.UserEntity;
import com.huutin.repository.UserRepository;
import com.huutin.service.impl.UserServices;


@Controller
public class UserController {
	String resultmessage;
	@Autowired
	private UserServices userService;
	
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public ModelAndView registerUser(@RequestParam("fullName") String name,@RequestParam("userName")String userName,@RequestParam("password")String password,@RequestParam("email") String email,@RequestParam("phone") String phone) {
		
			UserEntity ue = userRepository.getUserByEmail(email);
			UserEntity ue1 = userRepository.findOneByUserNameAndStatus(userName, 1);
			if(ue1==null){
				if(ue==null) {
					System.out.println("mail ok");
					User user = new User();
					user.setFullName(name);
					user.setUserName(userName);
					user.setPassword(password);
					user.setEmail(email);
					user.setPhone(phone);
					userService.save(user);
					ModelAndView mav = new ModelAndView("register/registerSuccess");
					return mav;
				}else {
					System.out.println("mail da dc dung");
					ModelAndView mav = new ModelAndView("register/register");
					return mav;
				}
			}else {
				System.out.println("user da ton tai");
				ModelAndView mav = new ModelAndView("register/register");
				return mav;
			}
	}
	 @RequestMapping("/search")
	    public ModelAndView viewHomePage(@RequestParam("keyword") String keyword) {
	        List<UserEntity> listUser = userService.listAll(keyword);
	        
			if(listUser.isEmpty()) {
	        	 resultmessage = "Not found result";
	        }else {
	        	resultmessage = "Result search";
	        }
	        ModelAndView mav = new ModelAndView("web/searchResult");
	        mav.addObject("msg", resultmessage);
	        mav.addObject("ListUser", listUser);
	        return mav;
	    }
	}
