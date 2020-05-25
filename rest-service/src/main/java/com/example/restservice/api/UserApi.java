package com.example.restservice.api;

//import java.text.SimpleDateFormat;
//import java.time.LocalDate;
//import java.util.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
//import java.time.LocalDate;
import java.util.Date;

import java.util.concurrent.atomic.AtomicLong;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
//import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.restservice.entity.User;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserApi {
	
	private final AtomicLong counter = new AtomicLong();
	private LocalDate fecha_hoy = LocalDate.now();
	// Crear un formatter con una representación específica
	private DateTimeFormatter fmt = DateTimeFormat.forPattern("dd-MM-yyyy");
	
    
	
	
	
	@RequestMapping(value = "/consulta", method = RequestMethod.GET)
	public User user(@RequestParam(value = "nombre", defaultValue = "NULL") String name, @RequestParam(value="fecha", defaultValue = "05/11/2016") String fecha) {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");
        String dateInString = "05/11/2016";
        //LocalDate fecha_hoy = LocalDate.now();
        try {
             
            Date date = formatter.parse(dateInString);
            System.out.println(date);
            System.out.println(formatter.format(date));

        } catch (ParseException e) {
            e.printStackTrace();
        }
        
		return new User(counter.incrementAndGet(), name, fecha);	
		//return new User(counter.incrementAndGet(), name, LocalDate.parse(fecha));	
	}

}
