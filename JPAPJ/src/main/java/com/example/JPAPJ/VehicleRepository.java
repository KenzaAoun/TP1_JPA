package com.example.JPAPJ;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

        import org.springframework.data.repository.CrudRepository;
//Repository created for the Vehicle class
public interface VehicleRepository extends CrudRepository<Vehicle, Long> {

    List<Vehicle> findByPlateNumber(int plateNumber);

}
