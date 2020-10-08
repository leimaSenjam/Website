package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Client;
import com.example.demo.model.Vehicle;
@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {

	
}

