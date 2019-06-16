package com.mehmetkuzu.beenthere.mbeans;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.mehmetkuzu.beenthere.business.UserService;

@ManagedBean
@SessionScoped
public class LoginBean {
	
	
	private String username;
	private String password;
	private boolean loggedIn;
	
	@EJB
	private UserService userService;
	
	public String login()
	{
		
		
	if(userService.checkUser(username, password))
		{
			this.loggedIn=true;
			return "user/userplacelist";
		}
		return "placelist";
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isLoggedIn() {
		return loggedIn;
	}
	public void setLoggedIn(boolean loggedIn) {
		this.loggedIn = loggedIn;
	}
	
	

}
