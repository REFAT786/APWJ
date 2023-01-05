package com.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "user")
public class User {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "username")
    private String username;

    @NotNull
    @Column(name = "password")
    private String password;
    @NotNull
    @Column(name = "gender")
    private String gender;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "user_taxcal_map",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "taxcal_id")
    )
    private List<Taxcalculator> taxcalculators;

    public List<Taxcalculator> getTaxcalculators() {
        return taxcalculators;
    }

    public void setTaxcalculators(List<Taxcalculator> taxcalculators) {
        this.taxcalculators = taxcalculators;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
