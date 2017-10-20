package com.patryk.zadanie2.Model;
import javax.persistence.*;

@Entity
public class Bbb {
    @Id
    @GeneratedValue(strategy= GenerationType.TABLE)
    private Long id;

    @Column
    private String tytul;

    @Column
    private Long autor_id;

    public Long getAutor_id() {
        return autor_id;
    }

    public void setAutor_id(Long autor_id) {
        this.autor_id = autor_id;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
