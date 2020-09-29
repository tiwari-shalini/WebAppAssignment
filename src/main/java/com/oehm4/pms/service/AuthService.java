package com.oehm4.pms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oehm4.pms.dao.AuthDAO;
import com.oehm4.pms.dto.LoginDTO;
import com.oehm4.pms.entity.Register;

@Service
public class AuthService 
{
	@Autowired
	private AuthDAO authDAO;
	public void saveRegisterDetails(Register register)
	{
		authDAO.saveRegisterDetails(register);
	}
	public Register getRegisterDataByEmailAndPwd(LoginDTO loginDTO)
	{
		return authDAO.getRegisterDataByEmailAndPwd(loginDTO);
	}
}
