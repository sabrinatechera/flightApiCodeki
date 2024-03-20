package com.example.flightApi.repository;

import com.example.flightApi.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {

    List<Flight> findByOrigin(String Origin);
    List<Flight> findByOriginAndDestination(String Origin, String destination);
}
