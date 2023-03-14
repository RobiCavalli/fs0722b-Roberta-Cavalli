package com.eserservizi_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eserservizi_1.models.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {

}
