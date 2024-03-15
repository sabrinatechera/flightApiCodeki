package com.example.flightApi.services.ServiceImpl;

import com.example.flightApi.model.Flight;
import com.example.flightApi.repository.FlightRepository;
import com.example.flightApi.services.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

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
    public Flight findById(Long id) {

        return flightRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Long id) {

        flightRepository.deleteById(id);

    }

    @Override
    public Flight updateFlight(Flight flight) {
        flightRepository.save(flight);
        return flightRepository.findById(flight.getId()).orElse(null);
    }
    @Override
    public List<Flight> finByOrigin(String origin){
        return flightRepository.findByOrigin(origin);
    }
}
