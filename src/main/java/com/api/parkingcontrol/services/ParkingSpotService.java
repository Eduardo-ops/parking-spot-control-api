package com.api.parkingcontrol.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.api.parkingcontrol.models.ParkingSpotModel;
import com.api.parkingcontrol.repositories.ParkingSpotRepository;

@Service
public class ParkingSpotService {

	// Ponto de injeção para o ParkingSportRepository
	// @Autowired
	// ParkingSportRepository parkingSportRepository;

	final ParkingSpotRepository parkingSportRepository;

	public ParkingSpotService(ParkingSpotRepository parkingSportRepository) {
		this.parkingSportRepository = parkingSportRepository;
	}

	@Transactional
	public ParkingSpotModel save(ParkingSpotModel parkingSpotModel) {
		return parkingSportRepository.save(parkingSpotModel);
	}

	public List<ParkingSpotModel> findAll() {
		return parkingSportRepository.findAll();
	}

	public boolean existsByLicensePlateCar(String licensePlateCar) {
		return parkingSportRepository.existsByLicensePlateCar(licensePlateCar);
	}

	public boolean existsByParkingSpotNumber(String parkingSpotNumber) {
		return parkingSportRepository.existsByParkingSpotNumber(parkingSpotNumber);
	}

	public boolean existsByApartmentAndBlock(String apartment, String block) {
		return parkingSportRepository.existsByApartmentAndBlock(apartment, block);
	}

}
