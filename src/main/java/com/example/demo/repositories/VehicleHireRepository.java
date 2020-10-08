package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Client;
import com.example.demo.model.VehicleHire;
@Repository
public interface VehicleHireRepository extends JpaRepository<VehicleHire, Integer> {

	
}

