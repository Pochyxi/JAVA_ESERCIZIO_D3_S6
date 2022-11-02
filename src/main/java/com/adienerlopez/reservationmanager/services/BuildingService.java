package com.adienerlopez.reservationmanager.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.adienerlopez.reservationmanager.entities.Building;
import com.adienerlopez.reservationmanager.repositories.BuildingRepository;

@Service
public class BuildingService {

	@Autowired
	BuildingRepository br;
	
	public void saveBuilding(Building b) {
		br.save(b);
	}
	
	public Optional<Building> getBuildingById(int id) {
		return br.findById(id);
	}
	
	public Iterable<Building> getAllBuildings(){
		return br.findAll();
	}
	
	public Iterable<Building> getAllAndPaginate(Pageable p){
		return br.findAll(p);
	}
	
	public void deleteBuildingById(int id) {
		br.deleteById(id);
	}
	
	public List<Building> getBuildingByCity(String c){
		return br.findBuildingByCity(c);
	}
}
