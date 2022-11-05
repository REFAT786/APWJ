package com.domain;


import javax.validation.constraints.NotNull;

public class Taxcalculator {

    private Long id;
    @NotNull
    private String catagory,zone;

    @NotNull
    private Long salary,rent,medical,conveyance,bonus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCatagory() {
        return catagory;
    }

    public void setCatagory(String catagory) {
        this.catagory = catagory;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }


    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public Long getRent() {
        return rent;
    }

    public void setRent(Long rent) {
        this.rent = rent;
    }

    public Long getMedical() {
        return medical;
    }

    public void setMedical(Long medical) {
        this.medical = medical;
    }

    public Long getConveyance() {
        return conveyance;
    }

    public void setConveyance(Long conveyance) {
        this.conveyance = conveyance;
    }


    public Long getBonus() {
        return bonus;
    }

    public void setBonus(Long bonus) {
        this.bonus = bonus;
    }

    private Long total;

    public Long getTotal() {
        total=salary+rent+medical+conveyance+bonus;
        return total;
    }

    public void setTotal(Long Total){this.total=Total; }

    private Long salarytaxable;

    public Long getSalarytaxable() {
        salarytaxable=salary*12;
        return salarytaxable;
    }

    public void setSalarytaxable(Long salarytaxable) {
        this.salarytaxable = salarytaxable;
    }
    private Long renttaxable;

    public Long getRenttaxable() {
        renttaxable=(rent*12)-(salary/2);
        return renttaxable;
    }

    public void setRenttaxable(Long renttaxable) {
        this.renttaxable = renttaxable;
    }
    private Long medicaltaxable;

    public Long getMedicaltaxable() {
        medicaltaxable=medical*12;
        return medicaltaxable;
    }

    public void setMedicaltaxable(Long medicaltaxable) {
        this.medicaltaxable = medicaltaxable;
    }
    private Long conveyancetaxable;

    public Long getConveyancetaxable() {
        conveyancetaxable=(conveyance*12)-30000;
        return conveyancetaxable;
    }

    public void setConveyancetaxable(Long conveyancetaxable) {
        this.conveyancetaxable = conveyancetaxable;
    }
    private Long bonustaxable;

    public Long getBonustaxable() {
        bonustaxable=salary*2;
        return bonustaxable;
    }

    public void setBonustaxable(Long bonustaxable) {
        this.bonustaxable = bonustaxable;
    }
    private  Long totaltaxable;

    public Long getTotaltaxable() {
        totaltaxable=salarytaxable+renttaxable+medicaltaxable+conveyancetaxable+bonustaxable;
        return totaltaxable;
    }

    public void setTotaltaxable(Long totaltaxable) {
        this.totaltaxable = totaltaxable;
    }
}