package com.mehmetkuzu.beenthere.mbeans;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import com.mehmetkuzu.beenthere.business.UserService;
import com.mehmetkuzu.beenthere.domain.Place;
import com.mehmetkuzu.beenthere.domain.User;

@ManagedBean
public class UserPlaceListBean {
	
	private List <User> users ;
	private List <Place> places;
	
	@EJB
	private UserService userService;
	
	
	
	

}
