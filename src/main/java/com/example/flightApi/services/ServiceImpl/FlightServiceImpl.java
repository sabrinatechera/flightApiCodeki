package com.example.flightApi.services.ServiceImpl;

import com.example.flightApi.model.Flight;
import com.example.flightApi.repository.FlightRepository;
import com.example.flightApi.services.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class FlightServiceImpl implements FlightService {

    @Autowired
    FlightRepository flightRepository;
    @Override
    public List<Flight> findAllFlights() {
        return flightRepository.findAll();
    }

    @Override
    public void createFlight(Flight flight) {
        flightRepository.save(flight);
    }

    @Override
    public Optional<Flight> findById(Long id) {
        return flightRepository.findById(id);
    }

    @Override
    public void deleteById(@PathVariable  Long id) {
        flightRepository.deleteById(id);
    }

    @Override
    public Optional<Flight> updateFlight(@RequestBody Flight flight) {
        flightRepository.save(flight);
        return flightRepository.findById(flight.getId());
    }
    @Override
    public List<Flight> findByOrigin(String origin){
        return flightRepository.findByOrigin(origin);
    }

    @Override
    public List<Flight> findByOriginAndDestiny(String origin, String destination){
        return flightRepository.findByOriginAndDestination(origin,destination);
    }

    @Override
    public List<Flight> findByPrice(double price){
        List <Flight> allFlights= flightRepository.findAll();
        return allFlights.stream()
                .filter(flight -> flight.getPrice() <= price)
                .collect(Collectors.toList());
    }
}
