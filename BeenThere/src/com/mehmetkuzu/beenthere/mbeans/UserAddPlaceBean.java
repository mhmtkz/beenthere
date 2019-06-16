package com.mehmetkuzu.beenthere.mbeans;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.primefaces.event.map.PointSelectEvent;
import org.primefaces.model.map.LatLng;

import com.mehmetkuzu.beenthere.business.UserService;
import com.mehmetkuzu.beenthere.domain.Place;


@ManagedBean
public class UserAddPlaceBean implements Serializable{
	
	private Place place = new Place();
	double lng = place.getLng();
	double lat = place.getLat();
	
	@EJB
	private UserService userService;
	

	public String addPlace()
	{
		
		userService.userAddPlace(place);
		return "placelist";
	}

	public Place getPlace() {
		return place;
	}

	public void setPlace(Place place) {
		this.place = place;
	}

	 public void onPointSelect(PointSelectEvent event) {
	        LatLng latlng = event.getLatLng();
	        double lat = latlng.getLat();
	        double lng= latlng.getLng();
	        place.setLat(lat); 
	        place.setLng(lng);

		    
	    }

	public double getLng() {
		return place.getLng();
	}

	public double getLat() {
		return place.getLat();
	}
	
	 
}
