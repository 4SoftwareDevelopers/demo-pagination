package com.example.demopagination.service.api;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.demopagination.model.Persona;

public interface PersonaServiceAPI {
	
	Page<Persona> getAll(Pageable pageable);

}
