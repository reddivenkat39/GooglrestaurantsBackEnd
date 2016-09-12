package org.googlrestaurants.repository;

import java.util.List;

import org.googlrestaurants.entities.Restaurantresult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface Restaurantresultrepository extends JpaRepository<Restaurantresult,Long> {

	@Query("SELECT a FROM Restaurantresult a WHERE requestedPlace like ?1")
	public List<Restaurantresult> restaurantlistbylocation(String location);
}
