package com.api.parkingcontrol.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import com.api.parkingcontrol.services.ParkingSportService;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600) // Permite que seja acessado de qualquer fonte.
@RequestMapping("/parking-sport")
public class ParkingSportController {
	
	//@Autowired
	//ParkingSportService parkingSportService;

	final ParkingSportService parkingSportService;

	public ParkingSportController(ParkingSportService parkingSportService) {
		super();
		this.parkingSportService = parkingSportService;
	}

}
