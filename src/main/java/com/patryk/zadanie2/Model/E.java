package com.patryk.zadanie2.Model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Collection;
import java.util.LinkedHashSet;

@Entity
public class E {

    @Id @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    private String id;

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

    public E(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
