package com.caqm;

import com.caqm.entity.dataitem.Airports;
import com.caqm.repository.AirportsRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class CaqmServerApplicationTests {

    @Autowired
    AirportsRepository airportsRepository;

    @Test
    void contextLoads() {
        List<Airports> all = airportsRepository.findAll();
        for (Airports airports : all) {
            System.out.println("这是输出");
            System.out.println(airports.toString());

        }
    }

}
