package com.patryk.zadanie2.Model;

import javax.persistence.*;

@Entity
public class A {

    @Id
    @GeneratedValue(strategy= GenerationType.TABLE)
    private long id;

    @Column(nullable = false)
    private String nazwa;

    public A(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
}
