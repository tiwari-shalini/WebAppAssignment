package com.oehm4.pms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.oehm4.pms.dto.LoginDTO;
import com.oehm4.pms.entity.Register;
import com.oehm4.pms.service.AuthService;

@Controller
@RequestMapping("/")
public class AuthController 
{
	@Autowired
	private AuthService authService;
	
	//@PostMapping(name = "/saveRegisterDetails")
	@RequestMapping(value = "/saveRegisterDetails")
	public ModelAndView saveRegisterDetails(Register register)
	{
		authService.saveRegisterDetails(register);
		return new ModelAndView("login.jsp","msg","Registration successfull please login!");
	}
	
	@RequestMapping(value = "/login")
	public ModelAndView login(LoginDTO loginDTO)
	{
		Register register=authService.getRegisterDataByEmailAndPwd(loginDTO);
		if (register!=null) {
			return new ModelAndView("home.jsp");
		}
		return new ModelAndView("login.jsp","msg","Invalid credentials!!");
	}
}
