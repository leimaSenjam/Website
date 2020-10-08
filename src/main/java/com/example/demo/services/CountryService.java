package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.Country;
import com.example.demo.repositories.CountryRepository;

@Service
public class CountryService {

	@Autowired
	private CountryRepository countryRepository;
	
	public List<Country> getCountries(){
	   return countryRepository.findAll();
	}

	
	public void save(Country country) {
		countryRepository.save(country);
	}
	
	public Optional<Country> findById(int id) {
		return  countryRepository.findById(id);
	}
	
	public void delete(Integer id) {
		countryRepository.deleteById(id);
	}
}
