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
    FlightRepository FlightRepository;
    @Override
    public List<Flight> findAllFlights() {
        return FlightRepository.findAll();
    }

    @Override
    public void createFlight(Flight flight) {
        FlightRepository.save(flight);
    }

    @Override
    public Flight findById(Long id) {

        return FlightRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Long id) {

        FlightRepository.deleteById(id);

    }

    @Override
    public Flight updateFlight(Flight flight) {
        FlightRepository.save(flight);
        return FlightRepository.findById(flight.getId()).orElse(null);
    }
}
