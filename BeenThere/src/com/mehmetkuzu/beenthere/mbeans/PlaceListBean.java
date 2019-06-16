package com.mehmetkuzu.beenthere.mbeans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import com.mehmetkuzu.beenthere.business.PlaceService;
import com.mehmetkuzu.beenthere.domain.Place;

@ManagedBean
public class PlaceListBean {
	
	private List<Place> places;
	
	@EJB
	private PlaceService placeService;
	
	@PostConstruct
	public void allPlaces()
	{
		this.places = placeService.getAllPlaces();
	}
	public void delete(int id)
	{
		placeService.deletePlace(id);
		this.places=placeService.getAllPlaces();
		}

	public List<Place> getPlaces() {
		return places;
}

	public void setPlaces(List<Place> places) {
		this.places = places;
	}

	
	
}
