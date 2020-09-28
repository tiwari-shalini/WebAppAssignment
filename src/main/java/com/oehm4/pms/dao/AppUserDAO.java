package com.oehm4.pms.dao;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oehm4.pms.entity.AppUserDetails;

@Repository
public class AppUserDAO 
{
	@Autowired
	private SessionFactory sessionFactory;
	public void saveUserData(AppUserDetails appUserDetails)
	{
		Session session=sessionFactory.openSession();
		try 
		{
			
			Transaction transaction=session.beginTransaction();
			session.save(appUserDetails);
			transaction.commit();
		} 
		catch (Exception e) 
		{
			
		}
		finally 
		{
			session.close();
		}
	}

}
