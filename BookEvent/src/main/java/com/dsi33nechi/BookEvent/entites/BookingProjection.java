package com.dsi33nechi.BookEvent.entites;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomClient", types = { Booking.class })
public interface BookingProjection {
	public String getNomClient();
}
