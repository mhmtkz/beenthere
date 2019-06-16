package com.mehmetkuzu.beenthere.business;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.mehmetkuzu.beenthere.domain.Comment;
import com.mehmetkuzu.beenthere.domain.Place;
import com.mehmetkuzu.beenthere.domain.User;


@Stateless
public class PlaceService {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	

	public List<Place> getAllPlaces() {
		return entityManager.createQuery("SELECT p FROM Place p",Place.class)
				.getResultList();
	}

	public void deletePlace(int id) {
		
		Place placeToDelete = 
				entityManager.find(Place.class, id); entityManager.remove(placeToDelete);
		}
public List<Place> getUserPlaces()
{
	return entityManager.createQuery("select p from Place p",Place.class)
			.getResultList();
	
}

public List<Comment> getAllComments(){
	
	return entityManager.createQuery("select c from Comment c",Comment.class).getResultList();
}

public void addComment(Comment comment) {
	// TODO Auto-generated method stub
	
}

}
