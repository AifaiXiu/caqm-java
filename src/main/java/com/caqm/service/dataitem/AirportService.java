package com.caqm.service.dataitem;

import com.caqm.entity.dataitem.Airports;
import com.caqm.repository.AirportsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirportService {

    @Autowired
    AirportsRepository airportsRepository;
    public List<Airports> testAirports(){
        return airportsRepository.findAll();
    }
}
