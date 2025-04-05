package com.caqm.controller.dataitem;

import com.caqm.entity.dataitem.Airports;
import com.caqm.service.dataitem.AirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/airport")
public class AirportController {

    @Autowired
    AirportService airportService;

    @GetMapping("/get")
    public List<Airports> getTest(){
        return airportService.testAirports();
    }
}
