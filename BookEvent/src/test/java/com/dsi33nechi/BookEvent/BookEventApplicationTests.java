package com.dsi33nechi.BookEvent;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dsi33nechi.BookEvent.entites.Booking;
import com.dsi33nechi.BookEvent.repos.BookingRepository;

@SpringBootTest
class BookEventApplicationTests {

	@Autowired
	private BookingRepository bookingRepository;
	
	@Test
	public void testFindByNomClient()
	{
	List<Booking> prods = bookingRepository.findByNomClient("Marwen");

	for (Booking p : prods)
	{
	System.out.println(p);
	}

	}
	
	@Test
	public void testFindByNomClientContains ()
	{
	List<Booking> prods=bookingRepository.findByNomClientContains("Amine");

	for (Booking p : prods)
	{
	System.out.println(p);
	} }
	
	@Test
	public void testfindByOrderByNomClientAsc()
	{
	List<Booking> prods = bookingRepository.findByOrderByNomClientAsc();
	for (Booking p : prods)
	{
	System.out.println(p);
	}

	}
	
	@Test
	public void testTrierBookingsNomsNombre()
	{
	List<Booking> prods = bookingRepository.trierBookingsNomsNombre();
	for (Booking p : prods)
	{
	System.out.println(p);
	}

	}
	
	
}
