package com.example.JPAPJ;

import java.util.List;
import java.util.Date;

import org.springframework.data.repository.CrudRepository;
//Repository created for the rent class
public interface RentRepository extends CrudRepository<Rent, Long> {

    List<Rent> findByBeginRent(Date beginRent);

}
