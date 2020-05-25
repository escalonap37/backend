package com.example.restservice.entity;

import java.util.List;





//import java.time.LocalDate;

public class User {
	
	private  long id;
	private  String nombre;
	private  String fecha;
	
	public long getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}
	
	public String getFecha() {
		return fecha;
	}

	public User(long id, String nombre, String fecha) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.fecha = fecha;
	}
	
	public User(){}
	
}
