package com.example.JPAPJ;

/* Class vehicle,
contain its constructors &
the method used to collect
the data of a vehicle object */

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Vehicle {

    private long id;
    private String plateNumber;
    private Rent rent;

    public Vehicle() {
        super();
    }

    public Vehicle(String plateNumber) {
        super();
        this.plateNumber = plateNumber;
    }

    @Id
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    @ManyToOne
    public Rent getRent() {
        return rent;
    }

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    @Override
    public String toString() {
        return "Vehicle [rent=" + ", id=" + id + ", plateNumber=" + plateNumber + "]";
    }

}
