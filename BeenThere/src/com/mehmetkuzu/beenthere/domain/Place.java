package com.mehmetkuzu.beenthere.domain;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.primefaces.event.map.PointSelectEvent;
import org.primefaces.model.map.LatLng;

import com.mehmetkuzu.beenthere.mbeans.EventView;

@Entity
public class Place {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	 private String placeName;
	 private double lng = 0;
	private double lat=0;
	
	@OneToMany(mappedBy="place")
	private List <Comment> comments = new ArrayList<Comment>();
	
	
	public Place() {
		
	}
	public Place(String placeName, double lng, double lat) {
	
		this.placeName = placeName;
		this.lng = lng;
		this.lat = lat;
	}
	
	
	public int getId() {
		return id;
	}

	public String getPlaceName() {
		return placeName;
	}
	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}
	public double getLng() {
		return lng;
	}
	public void setLng(double lng) {
		this.lng = lng;
	}
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}


	
	
}
