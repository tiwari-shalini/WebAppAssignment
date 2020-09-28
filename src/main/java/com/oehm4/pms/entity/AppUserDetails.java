package com.oehm4.pms.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="app_user_details")
public class AppUserDetails implements Serializable
{
	@Id
	@GenericGenerator(name = "app_auto", strategy = "increment")
	@GeneratedValue(generator = "app_auto")
	@Column(name = "id")
	private Long id;
	@Column(name="app_name")
	private String appName;
	@Column(name="user_name")
	private String userName;
	@Column(name="email")
	private String email;
	@Column(name="password")
	private String password;
	
	public AppUserDetails() {
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "AppUserDetails [id=" + id + ", appName=" + appName + ", userName=" + userName + ", email=" + email
				+ ", password=" + password + "]";
	}
	
}
