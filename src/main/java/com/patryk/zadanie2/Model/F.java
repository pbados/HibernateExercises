package com.patryk.zadanie2.Model;

import javax.persistence.*;

@Entity
@IdClass(FKeys.class)
public class F {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id1;

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id2;

    @Column
    private String n1;

    @Column
    private Integer i1;

    public F(){}

    public Long getId1() {
        return id1;
    }

    public void setId1(Long id1) {
        this.id1 = id1;
    }

    public Long getId2() {
        return id2;
    }

    public void setId2(Long id2) {
        this.id2 = id2;
    }

    public String getN1() {
        return n1;
    }

    public void setN1(String n1) {
        this.n1 = n1;
    }

    public Integer getI1() {
        return i1;
    }

    public void setI1(Integer i1) {
        this.i1 = i1;
    }
}
