package com.mehmetkuzu.beenthere.mbeans;

	
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import org.primefaces.context.RequestContext;

import com.mehmetkuzu.beenthere.business.UserService;
import com.mehmetkuzu.beenthere.domain.User;
	

	@ManagedBean
	public class RegisterBean {

	
	@Inject LoginBean loginBean;  //?
	
	private User user = new User();
	private String username;
	private String password;
	private boolean registered;

	@EJB
	private UserService userService;
	
	
	public String registerUser()
	{
	 
		if(userService.checkUserName(username))
		{
			RequestContext.getCurrentInstance().showMessageInDialog(new FacesMessage(FacesMessage.SEVERITY_INFO, "Error", "Username exists"));
FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Username already exist, try another"));
		}
		else
		{
		newUser();
			return "login";
		}
		

		
		return "";
	}


	
	public RegisterBean() {

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


	public boolean isRegistered() {
		return registered;
	}


	public void setRegistered(boolean registered) {
		this.registered = registered;
	}

	
	public void newUser()
	{
		User user = new User();
		user.setUsername(getUsername());
		user.setPassword(getPassword());
		
		
		userService.registerUser(user);;

	}
	
	
	}

	
	//logged in or not durumunu xhtmlde kontrol et
	
	
