package com.example.JPAPJ;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
//Repository created for the Person class
public interface PersonRepository extends CrudRepository<Person, Long> {

    List<Vehicle> findByName(String name);

}
