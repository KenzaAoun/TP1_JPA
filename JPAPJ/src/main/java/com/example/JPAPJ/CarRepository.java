package com.example.JPAPJ;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
//repository created for the car class
public interface CarRepository extends CrudRepository<Car, Long> {

    List<Car> findByNumberOfSeats(int numberOfSeats);

}
