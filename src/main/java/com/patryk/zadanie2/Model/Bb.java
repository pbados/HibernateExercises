package com.patryk.zadanie2.Model;

import javax.persistence.*;

@Entity
public class Bb {

    @Id
    @GeneratedValue(strategy= GenerationType.TABLE)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    private Aa aa;

    @Column(nullable = false)
    private String stolica;

    public String getStolica() {
        return stolica;
    }

    public void setStolica(String stolica) {
        this.stolica = stolica;
    }

    public Bb() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Aa getAa() {
        return aa;
    }

    public void setAa(Aa aa) {
        this.aa = aa;
    }
}
