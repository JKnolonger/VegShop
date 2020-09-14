package com.huutin.controller.web;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.huutin.service.impl.MailService;


@Controller(value = "homeControllerOfWeb")
public class HomeController {
	@Autowired
	private MailService mailService; 
	
	@RequestMapping(value = "/trang-chu", method = RequestMethod.GET)
	public ModelAndView homePage() {
		ModelAndView mav = new ModelAndView("web/home");
		
		return mav;
	}
	@RequestMapping(value = "/dang-nhap", method = RequestMethod.GET)
	public ModelAndView loginPage() {
		ModelAndView mav = new ModelAndView("login/login");
		return mav;
	}
	@RequestMapping(value = "/dang-ki", method = RequestMethod.GET)
	public ModelAndView registerPage() {
		ModelAndView mav = new ModelAndView("register");
		return mav;
	}
	@RequestMapping(value="/quen-mat-khau")
	public ModelAndView forgotPage() {
		ModelAndView mav = new ModelAndView("forgetpassword/forgotPassword");
		return mav;
	}
	@RequestMapping(value="/resetPassword" , method=RequestMethod.POST)
	public ModelAndView resetRequest(@RequestParam(value="email") String email)
	{
		//check if the email id is valid and registered with us.
		mailService.sendMail(email);
		System.out.println("da gui mail");
		ModelAndView mav = new ModelAndView("forgetpassword/checkMail");
		return mav;
	}
	
	@RequestMapping(value="/savePass" , method=RequestMethod.POST)
	public ModelAndView save(@RequestParam(value="pass") String pass)
	{
		System.out.println("da luu mat khau: "+pass);
		ModelAndView mav = new ModelAndView("forgetpassword/resetPasswordSuccess");
		return mav;
	}
	
	@RequestMapping(value="/newPassword/{email}" )
	public ModelAndView newPassword(@PathVariable String email,Map<String,String> model)
	{
		//check if the email id is valid and registered with us.
		model.put("emailid", email);
		ModelAndView mav = new ModelAndView("forgetpassword/newPassword");
		return mav;
	}



	@RequestMapping(value = "/thoat", method = RequestMethod.GET)
	public ModelAndView logout(HttpServletRequest request, HttpServletResponse response) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth != null) {
			new SecurityContextLogoutHandler().logout(request, response, auth);
		}
		return new ModelAndView("redirect:/trang-chu");
	}
	@RequestMapping(value = "/accessDenied", method = RequestMethod.GET)
	public ModelAndView accessDenied() {
		return new ModelAndView("redirect:/dang-nhap?accessDenied");
	}
}
