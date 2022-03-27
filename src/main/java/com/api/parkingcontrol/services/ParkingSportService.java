package com.api.parkingcontrol.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.parkingcontrol.repositories.ParkingSportRepository;

@Service
public class ParkingSportService {

	// Ponto de injeção para o ParkingSportRepository
	//@Autowired
	//ParkingSportRepository parkingSportRepository;

	final ParkingSportRepository parkingSportRepository;

	public ParkingSportService(ParkingSportRepository parkingSportRepository) {
		this.parkingSportRepository = parkingSportRepository;
	}

}
