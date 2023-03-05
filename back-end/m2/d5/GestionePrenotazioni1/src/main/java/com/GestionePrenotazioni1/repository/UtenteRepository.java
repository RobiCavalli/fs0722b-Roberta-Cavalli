package com.GestionePrenotazioni1.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.GestionePrenotazioni1.model.Utente;
@Repository
public interface UtenteRepository extends CrudRepository<Utente, Long> {

}
