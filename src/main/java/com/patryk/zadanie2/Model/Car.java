package com.patryk.zadanie2.Model;

import com.patryk.zadanie2.ColorConverter;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;

@Entity
public class Car extends Vehicle {

    @Column
    private String name;

    @Column
    @Convert(converter = ColorConverter.class)
    private Color myColor;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getMyColor() {
        return myColor;
    }

    public void setMyColor(Color myColor) {
        this.myColor = myColor;
    }
}
