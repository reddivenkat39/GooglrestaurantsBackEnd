package org.googlrestaurants.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the restaurantresults database table.
 * 
 */
@Entity
public class Restaurantresult implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="id_")
	private String id;

	@Column(name="lat_")
	private String lat;
	
	@Id
	private String long_;
	@Column(name="place_id")
	private String placeId;
	
	

	@Column(name="requested_place")
	private String requestedPlace;
	
	
	public Restaurantresult() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLat() {
		return this.lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLong_() {
		return this.long_;
	}

	public void setLong_(String long_) {
		this.long_ = long_;
	}

	public String getPlaceId() {
		return this.placeId;
	}

	public void setPlaceId(String placeId) {
		this.placeId = placeId;
	}
	
	public String getrequestedPlace() {
		return this.requestedPlace;
	}

	public void setrequestedPlace(String requestedPlace) {
		this.requestedPlace = requestedPlace;
	}

}