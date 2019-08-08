package com.example.demopagination.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demopagination.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
	

}
