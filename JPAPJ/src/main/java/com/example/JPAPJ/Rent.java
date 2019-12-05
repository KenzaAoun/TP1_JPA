package com.example.JPAPJ;

/* Class rent,
contain its constructors &
the method used to collect
the data of a rent object */

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.Calendar;

@Entity
public class Rent {

    private long id;
    private Date beginRent;
    private Date endRent;
    private Person person;

    private List<Vehicle> Vehicles = new ArrayList<Vehicle>();

    public Rent() {
        super();
    }

    public Rent(Date beginRent, Date endRent, long id) {
        super();
        this.beginRent = beginRent ;
        this.endRent = endRent ;
        this.id = id;

    }

    @Override
    public String toString() {
        return "Rent [id=" + id + ", beginRent=" + beginRent + ", endRent=" + endRent + ", person=" + person
                + ", Vehicles=" + Vehicles + "]";
    }
    //Implementation of the relationship that represent the link with the person class
    @OneToMany(mappedBy="rent", cascade=CascadeType.ALL, fetch = FetchType.EAGER)
    public List<Vehicle> getVehicle() {
        return Vehicles;
    }

    public void setVehicle(List<Vehicle> Vehicles) {
        this.Vehicles = Vehicles;
    }

    @ManyToOne
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Id
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public Date getBeginRent() {
        return beginRent;
    }
    //conversion of a date value
    public void setBeginRent(Date date) {
        this.beginRent = date;
    }
    public Date getEndRent() {
        return endRent;
    }
    public void setEndRent(Date date) {
        this.endRent = date;
    }
}
