package com.example.demopagination.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demopagination.model.Persona;
import com.example.demopagination.repository.PersonaRepository;
import com.example.demopagination.service.api.PersonaServiceAPI;

@Service
public class PersonaServiceImpl implements PersonaServiceAPI {
	
	@Autowired
	private PersonaRepository personaRepository;

	@Override
	public Page<Persona> getAll(Pageable pageable) {
		
		return personaRepository.findAll(pageable);
	}

}
