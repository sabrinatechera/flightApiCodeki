package com.example.flightApi.controllers;

import com.example.flightApi.model.Flight;
import com.example.flightApi.services.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vuelos")
public class FlightController {


    FlightService flightService;

    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }

    @GetMapping("")
    public List<Flight> getAllFlights(){
        return null;
    }

    @PostMapping("/agregar")
    public void createFlight(@RequestBody Flight flight){
        flightService.createFlight(flight);
    }

    @GetMapping("/{id}")
    public Flight findFlightById(@PathVariable Long id){
        return null;
    }

    @DeleteMapping("/eliminar/{id}")
    public void deleteFlight(@PathVariable Long id){

        flightService.deleteById(id);
    }

    @PutMapping("/actualizar")
    public Flight updateFlight(@RequestBody Flight flight){
        return flightService.updateFlight(flight);
    }

}