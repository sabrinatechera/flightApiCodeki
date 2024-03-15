package com.example.flightApi.services;

import com.example.flightApi.model.Flight;

import java.util.List;

public interface FlightService {
    List<Flight> findAllFlights();

    void createFlight(Flight flight);

    Flight findById(Long id);

    void deleteById(Long id);

    Flight updateFlight(Flight flight);

    List<Flight> finByOrigin(String origin);
}
