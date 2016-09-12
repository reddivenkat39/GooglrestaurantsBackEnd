package org.googlrestaurants.services;

import java.util.List;

import org.googlrestaurants.entities.Restaurantresult;
import org.googlrestaurants.repository.Restaurantresultrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestaurantsResultsCrudService {
	
	@Autowired
	Restaurantresultrepository restaurantsrepo;
	@RequestMapping("/addresults")
	public String addingrestaurants(@RequestParam("id") String id, @RequestParam("placeid") 
	String placeid, @RequestParam("lat") String latitude, @RequestParam("long") String longitude,
	@RequestParam("requestedLocation") String requestedPlace){
		Restaurantresult result = new Restaurantresult();
		result.setId(id);
		result.setLat(latitude);
		result.setLong_(longitude);
		result.setPlaceId(placeid);
		result.setrequestedPlace(requestedPlace);
		restaurantsrepo.save(result);
		restaurantsrepo.flush();
		return "added to the repo";
	}
	
	@RequestMapping("/retrieveResults")
	public ResponseEntity<List<Restaurantresult>> restaurants(@RequestParam("locationname") String location){
		location = "%"+location+"%";
		List<Restaurantresult> restaurantslist = restaurantsrepo.restaurantlistbylocation(location);
		return new ResponseEntity<List<Restaurantresult>>(restaurantslist,HttpStatus.OK);
		
	}
}
