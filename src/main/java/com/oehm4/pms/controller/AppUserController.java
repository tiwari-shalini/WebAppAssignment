package com.oehm4.pms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.oehm4.pms.entity.AppUserDetails;
import com.oehm4.pms.service.AppUserService;

@Controller
@RequestMapping("/")
public class AppUserController 
{
	@Autowired
	private AppUserService appUserService;
	
	//@PostMapping("/saveUserData")
	@RequestMapping(value = "/saveUserData")
	public ModelAndView saveUserData(AppUserDetails appUserDetails)
	{
		appUserService.saveUserData(appUserDetails);
		return new ModelAndView("home.jsp");
	}
}
