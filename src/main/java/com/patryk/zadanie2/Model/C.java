package com.patryk.zadanie2.Model;

import com.patryk.zadanie2.ColorConverter;
import com.patryk.zadanie2.LocalDateAttributeConverter;
import com.patryk.zadanie2.LongAttributeConverter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class C {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;

    @Column
    private String name;

    @Column
    @Convert(converter = LocalDateAttributeConverter.class)
    private LocalDate myDate;

    @Column
    @Convert(converter = LongAttributeConverter.class)
    private LocalDate myDate2;

    @Column
    //@Enumerated(EnumType.STRING)
    @Convert(converter = ColorConverter.class)
    private Color color;

    public C(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getMyDate() {
        return myDate;
    }

    public void setMyDate(LocalDate myDate) {
        this.myDate = myDate;
    }

    public LocalDate getMyDate2() {
        return myDate2;
    }

    public void setMyDate2(LocalDate myDate2) {
        this.myDate2 = myDate2;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
