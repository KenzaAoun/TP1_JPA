package com.example.JPAPJ;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/* Class Van,
contain its constructors &
the method used to collect
the data of a van object */
/*
@Entity

public class Van extends Vehicle{

    private long ID_Van;
    private int maxWeight;

    public Van() {super ();}

    public Van(long ID_Van, int maxWeight){
        super();
        this.ID_Van = ID_Van;
        this.maxWeight = maxWeight;
    }


    @Id
    public long getID_Van() {
        return ID_Van;
    }
    public void setID_Van(long ID_Van) {
        this.ID_Van = ID_Van;
    }
    public int getMaxWeight() {
        return maxWeight;
    }
    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }
}*/

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Van {

    private long id;
    private int maxWeight;

    public Van() {
        super();
    }

    public Van(int maxWeight) {
        super();
        this.maxWeight = maxWeight;
    }

    @Id
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }
}
