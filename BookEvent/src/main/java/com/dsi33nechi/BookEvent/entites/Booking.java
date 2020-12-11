package com.dsi33nechi.BookEvent.entites;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import com.sun.istack.NotNull;

@Entity
public class Booking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idBooking;
	
	@NotNull
	@Size (min = 4,max = 15)
	private String nomClient;
	
	@Min(value = 1)
	@Max(value = 10)
	private int nombre;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@PastOrPresent
	private Date dateReserv;
	
	@ManyToOne
	private Event events;
	
	
	public Event getEvents() {
		return events;
	}


	public void setEvents(Event events) {
		this.events = events;
	}


	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Booking(String nomClient, int nombre, Date dateReserv) {
		super();
		this.nomClient = nomClient;
		this.nombre = nombre;
		this.dateReserv = dateReserv;
	}


	public Long getIdBooking() {
		return idBooking;
	}


	public void setIdBooking(Long idBooking) {
		this.idBooking = idBooking;
	}


	public String getNomClient() {
		return nomClient;
	}


	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}


	public int getNombre() {
		return nombre;
	}


	public void setNombre(int nombre) {
		this.nombre = nombre;
	}


	public Date getDateReserv() {
		return dateReserv;
	}


	public void setDateReserv(Date dateReserv) {
		this.dateReserv = dateReserv;
	}


	@Override
	public String toString() {
		return "Booking [idBooking=" + idBooking + ", nomClient=" + nomClient + ", nombre=" + nombre + ", dateReserv="
				+ dateReserv + "]";
	}
	
	
	
	
	
	
}
