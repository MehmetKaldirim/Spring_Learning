package com.cydeo.repository;

import com.cydeo.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car,Long> {
  //we can write our custom method here - queires
  // and also sql
}
