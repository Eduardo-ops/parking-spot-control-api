package com.api.parkingcontrol.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.api.parkingcontrol.models.ParkingSpotModel;

import java.util.UUID;

/*
 *  JPA repository possui vários métodos prontos que podem ser utilizados para transações com banco de dados,
 *  exemplo seria buscar uma listagem de um determinado recurso, buscar um recurso único como também criar e deletar,
 *  sem ter a necessidade de ficar criando queryes.
 *
 **/
public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID> {

	boolean existsByLicensePlateCar(String licensePlateCar);

	boolean existsByParkingSpotNumber(String number);

	boolean existsByApartmentAndBlock(String apartment, String block);

}
