package com.oehm4.pms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oehm4.pms.dao.AppUserDAO;
import com.oehm4.pms.entity.AppUserDetails;

@Service
public class AppUserService 
{
	@Autowired
	private AppUserDAO appUserDAO;
	public void saveUserData(AppUserDetails appUserDetails)
	{
		appUserDAO.saveUserData(appUserDetails);
	}
}
