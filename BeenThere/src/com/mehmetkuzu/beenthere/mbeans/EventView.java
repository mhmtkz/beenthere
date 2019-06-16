package com.mehmetkuzu.beenthere.mbeans;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.map.PointSelectEvent;
import org.primefaces.event.map.StateChangeEvent;
import org.primefaces.model.map.LatLng;
import org.primefaces.model.map.LatLngBounds;

import com.mehmetkuzu.beenthere.domain.Place;

@ManagedBean
@ViewScoped
public class EventView {
	private String placeName; 
	private double lat=0;
	private double lng=0;
	
	public void Place(String placeName, double lng, double lat) {
		
		this.placeName = placeName;
		this.lng = lng;
		this.lat = lat;
	}

	      
	    public void onPointSelect(PointSelectEvent event) {
	        LatLng latlng = event.getLatLng();
	        this.lat =   latlng.getLat();
	         this.lng= latlng.getLng();
	     
	    }
	 
		public double getLat() {
			return lat;
		}

		public void setLat(double lat) {
			this.lat = lat;
		}

		public double getLng() {
			return lng;
		}

		public void setLng(double lng) {
			this.lng = lng;
		}


}
