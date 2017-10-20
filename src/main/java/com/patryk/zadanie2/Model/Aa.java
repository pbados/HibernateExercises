package com.patryk.zadanie2.Model;

import javax.persistence.*;

@Entity
public class Aa {

    @Id
    @GeneratedValue(strategy= GenerationType.TABLE)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    private Bb bb;

    @Column(nullable = false)
    private String panstwo;

    public Aa() {
    }

    public String getPanstwo() {
        return panstwo;
    }

    public void setPanstwo(String panstwo) {
        this.panstwo = panstwo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Bb getBb() {
        return bb;
    }

    public void setBb(Bb bb) {
        this.bb = bb;
    }
}
