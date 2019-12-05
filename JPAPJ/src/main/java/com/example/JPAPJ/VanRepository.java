package com.example.JPAPJ;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

//Repository created on the Van class
public interface VanRepository extends CrudRepository<Van, Long> {

    List<Van> findByMaxWeight(int maxWeight);

}
