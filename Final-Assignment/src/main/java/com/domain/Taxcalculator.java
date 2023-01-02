package com.domain;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "taxcal")
public class Taxcalculator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Column(name = "catagory")
    private String catagory;
    @NotNull
    @Column(name = "zone")
    private String zone;
    @NotNull
    @Column(name = "gsalary")
    private Long gsalary;
    @NotNull
    @Column(name = "salary")
    private Long salary;
    @NotNull
    @Column(name = "rent")
    private Long rent;
    @NotNull
    @Column(name = "medical")
    private Long medical;
    @NotNull
    @Column(name = "conveyance")
    private Long conveyance;
    @NotNull
    @Column(name = "others")
    private Long others;

    @ManyToMany(mappedBy = "taxcalculators")

    private List<User> users;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

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

    public Long getGsalary() {
        return gsalary;
    }

    public void setGsalary(Long gsalary) {
        this.gsalary = gsalary;
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

    public Long getOthers() {
        return others;
    }

    public void setOthers(Long others) {
        this.others = others;
    }


    @Column(name = "total")
    private Long total;

    public Long getTotal() {
        total=salary+rent+medical+conveyance+others;
        return total;
    }

    public void setTotal(Long Total){this.total=Total; }

    @Column(name = "salarytaxable")
    private Long salarytaxable;

    public Long getSalarytaxable() {
        salarytaxable=salary*12;
        return salarytaxable;
    }

    public void setSalarytaxable(Long salarytaxable) {
        this.salarytaxable = salarytaxable;
    }

    @Column(name = "renttaxable")
    private Long renttaxable;

    public Long getRenttaxable() {
        renttaxable=(rent*12)-(salary/2);
        if(renttaxable > 300000){
            renttaxable = Long.valueOf(300000);
        }
        return renttaxable;
    }

    public void setRenttaxable(Long renttaxable) {
        this.renttaxable = renttaxable;
    }

    @Column(name = "medicaltaxable")
    private Long medicaltaxable;

    public Long getMedicaltaxable() {
        medicaltaxable=medical*12;
        return medicaltaxable;
    }

    public void setMedicaltaxable(Long medicaltaxable) {
        this.medicaltaxable = medicaltaxable;
    }

    @Column(name = "conveyancetaxable")
    private Long conveyancetaxable;

    public Long getConveyancetaxable() {
        conveyancetaxable=(conveyance*12)-30000;
        return conveyancetaxable;
    }

    public void setConveyancetaxable(Long conveyancetaxable) {
        this.conveyancetaxable = conveyancetaxable;
    }

    @Column(name = "otherstaxable")
    private Long otherstaxable;

    public Long getOtherstaxable() {
        otherstaxable=others*12;
        return otherstaxable;
    }

    public void setOtherstaxable(Long otherstaxable) {
        this.otherstaxable = otherstaxable;
    }

    @Column(name = "totaltaxable")
    private  Long totaltaxable;

    public Long getTotaltaxable() {
        Long i= Long.valueOf(0);
        totaltaxable=salarytaxable+renttaxable+medicaltaxable+conveyancetaxable+otherstaxable;
       if(catagory.equals("Female")){
           i= Long.valueOf(350000);
       } else if (catagory.equals("Male")) {
           i= Long.valueOf(300000);
       }
       else {
           i= Long.valueOf(0);
       }
        totaltaxable=totaltaxable-i;
        return totaltaxable;
    }

    public void setTotaltaxable(Long totaltaxable) {
        this.totaltaxable = totaltaxable;
    }
    @Column(name = "monthly")
    private Long monthly;

    public Long getMonthly() {
        return monthly=totaltaxable/12;
    }

    public void setMonthly(Long monthly) {
        this.monthly = monthly;
    }
}