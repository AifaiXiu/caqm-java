package com.caqm.repository;

import com.caqm.entity.dataitem.Airports;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface AirportsRepository extends JpaRepository<Airports, Long> , JpaSpecificationExecutor<Airports> {
}
