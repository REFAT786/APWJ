package com.domain;

import javax.validation.constraints.NotNull;

public class Grosscalculate {
    private Long id;

    @NotNull
    private Long gross;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getGross() {
        return gross;
    }

    public void setGross(Long gross) {
        this.gross = gross;
    }
    private double salary;
    private double rent;
    private double medical;
    private double conveyance;

    public double getSalary() {

        salary=gross*0.5;
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public double getRent() {

        rent=gross*0.3;
        return rent;
    }

    public void setRent(Long rent) {
        this.rent = rent;
    }

    public double getMedical() {
        medical=gross*0.08;
        return medical;
    }

    public void setMedical(Long medical) {
        this.medical = medical;
    }

    public double getConveyance() {
        conveyance=gross*0.08;
        return conveyance;
    }

    public void setConveyance(Long conveyance) {
        this.conveyance = conveyance;
    }

    private double other;

    public double getOther() {
        other=gross*0.04;
        return other;
    }

    public void setOther(double other) {
        this.other = other;
    }
}
