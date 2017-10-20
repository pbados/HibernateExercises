package com.patryk.zadanie2.Model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Aaa {

    @Id
    @GeneratedValue(strategy= GenerationType.TABLE)
    private Long id;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "autor_id")
    private List<Bbb> bbb;

    @Column
    private String autor;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Aaa() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Bbb> getBbb() {
        return bbb;
    }

    public void setBbb(List<Bbb> bbb) {
        this.bbb = bbb;
    }
}
