package com.dsi33nechi.BookEvent;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.dsi33nechi.BookEvent.entites.Booking;
import com.dsi33nechi.BookEvent.service.BookingService;

@SpringBootApplication
public class BookEventApplication implements CommandLineRunner {
	
	
	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;
	public static void main(String[] args) {
	SpringApplication.run(BookEventApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
	repositoryRestConfiguration.exposeIdsFor(Booking.class);
	}

}
