package com.mehmetkuzu.beenthere.business;


import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.mehmetkuzu.beenthere.domain.Place;
import com.mehmetkuzu.beenthere.domain.User;




@Stateless
public class UserService {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	
	
	public boolean checkUser(String uname,String pass)
	{
	  TypedQuery<User> query = 	entityManager
			  .createQuery("select u from User u where"
			  		+ " u.username=:username and"
			  		+ " u.password=:password",User.class);
	  query.setParameter("username", uname);
	  query.setParameter("password", pass);
	  List<User> users =   query.getResultList();
	  
	  if(users==null || users.size()<1)
	  {
		  return false;
	  }
	  return true;
	}

	public void userAddPlace(Place place)
	
	{
		entityManager.persist(place);
		
	}
	
	public boolean checkUserName(String uname)
	{
	  TypedQuery<User> query = 	entityManager
			  .createQuery("select u from User u where"
			  		+ " u.username=:username",User.class);
	  query.setParameter("username", uname);
	  List<User> users =   query.getResultList();
	  
	  if(users==null || users.size()<1)
	  {
		  return false;
	  }
	  return true;
	}
	///user place list methodu ekle
	
	
	
	public void registerUser(User user)
	
	{
		entityManager.persist(user);
		
	}
	
	
}
