package com.example.JPAPJ;

/* Class car, contain its constructors & the method used to collect the data of a car object */

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car {

    private long id;
    private int numberOfSeats;

    public Car() {
        super();
    }

    public Car(int numberOfSeats) {
        super();
        this.numberOfSeats = numberOfSeats;
    }

    @Id
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
}
