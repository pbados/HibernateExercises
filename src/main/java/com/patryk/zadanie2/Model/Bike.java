package com.patryk.zadanie2.Model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Bike extends Vehicle {

    @Column(unique = true)
    private Long number;

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }
}
