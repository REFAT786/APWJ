package com.domain;

import org.springframework.context.annotation.Primary;

import javax.persistence.*;
import java.security.PrivateKey;

@Entity
@Table(name = "customize_package")
public class CustomizePackage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="place")
    private String place;

    @Column(name = "person")
    private String  person;

    @Column(name = "transportation")
    private String transportation;

    @Column(name = "cost")
    private String cost;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public String getTransportation() {
        return transportation;
    }

    public void setTransportation(String transportation) {
        this.transportation = transportation;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }
}
