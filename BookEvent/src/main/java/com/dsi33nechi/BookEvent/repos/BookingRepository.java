package com.dsi33nechi.BookEvent.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.dsi33nechi.BookEvent.entites.Booking;


@RepositoryRestResource(path = "rest")
public interface BookingRepository extends JpaRepository<Booking , Long>  {
	List<Booking> findByNomClient(String nom);
	List<Booking> findByNomClientContains(String nom);
	
	List<Booking> findByOrderByNomClientAsc();
	
	@Query("select p from Booking p order by p.nomClient ASC, p.nombre DESC")
	List<Booking> trierBookingsNomsNombre();
	
	@Query("select p from Booking p where p.events.idEvent =1")
	List<Booking> findByBookingIdEvent();

	
	
}
