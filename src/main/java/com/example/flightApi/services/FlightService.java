package com.example.flightApi.services;

import com.example.flightApi.model.Flight;

import java.util.List;
import java.util.Optional;

public interface FlightService {
    List<Flight> findAllFlights();

    void createFlight(Flight flight);

    Optional<Flight> findById(Long id);

    void deleteById(Long id);

    Optional<Flight> updateFlight(Flight flight);

    List<Flight> findByOrigin(String origin);
    List<Flight> findByOriginAndDestiny(String origin, String destiny);

    List<Flight> findByPrice(double price);
}
