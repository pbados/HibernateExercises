package com.patryk.zadanie2.Model;

import javax.persistence.*;
import java.util.*;

@Entity
@Embeddable
public class D {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;

    @Column
    @ElementCollection
    private Collection<String> names = new LinkedHashSet<>();

    @Column
    @ElementCollection
    private Collection<Integer> numbers = new LinkedHashSet<>();

    /*@Column
    @ElementCollection
    private Collection<String> names = new ArrayList<>();

    @Column
    @ElementCollection
    private Collection<Integer> numbers = new ArrayList<>();*/

    public D(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Embedded
    public Collection<String> getNames() {
        return names;
    }

    public void setNames(Collection<String> names) {
        this.names = names;
    }

    @Embedded
    public Collection<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(Collection<Integer> numbers) {
        this.numbers = numbers;
    }
}