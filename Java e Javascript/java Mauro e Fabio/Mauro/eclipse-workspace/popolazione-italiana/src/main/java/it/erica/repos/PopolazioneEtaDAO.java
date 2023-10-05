package it.erica.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.erica.entities.RegioneProvince;

@Repository
public interface PopolazioneEtaDAO extends JpaRepository<RegioneProvince, Integer>{

}
