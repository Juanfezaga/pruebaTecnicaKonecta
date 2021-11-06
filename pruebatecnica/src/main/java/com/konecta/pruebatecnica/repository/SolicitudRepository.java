package com.konecta.pruebatecnica.repository;

import com.konecta.pruebatecnica.models.Solicitud;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface SolicitudRepository extends CrudRepository<Solicitud, Long> {


    @Query(value="SELECT * FROM Solicitud", nativeQuery = true)
    List<Solicitud> findAllPetitions();
}

