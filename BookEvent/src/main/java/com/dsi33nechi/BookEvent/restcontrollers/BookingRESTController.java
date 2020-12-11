package com.dsi33nechi.BookEvent.restcontrollers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dsi33nechi.BookEvent.entites.Booking;
import com.dsi33nechi.BookEvent.service.BookingService;


@RestController
@RequestMapping("/api")
@CrossOrigin
public class BookingRESTController {
	@Autowired
	BookingService bookingService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Booking> getAllBookings() {
	return bookingService.getAllBookings();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Booking getBookingById(@PathVariable("id") Long id) {
	return bookingService.getBooking(id);

	}
	
	
	@RequestMapping(method = RequestMethod.POST)
	public Booking createBooking(@RequestBody Booking booking) {
	return bookingService.saveBooking(booking);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Booking updateBooking(@RequestBody Booking booking) {
	return bookingService.updateBooking(booking);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteBooking(@PathVariable("id") Long id)
	{
	bookingService.deleteBookingById(id);
	}
	
	@RequestMapping(value="/bokev/{idEvent}",method = RequestMethod.GET)
	public List<Booking> getBookingsByEventId(@PathVariable("idEvent") Long idEvent) {
	return bookingService.findByBookingIdEvent(idEvent);
	}

}
