package com.patryk.zadanie2;

import com.patryk.zadanie2.Model.E;
import com.patryk.zadanie2.Repository.ERepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import javax.transaction.Transactional;

@SpringBootTest(classes=Zadanie2Application.class)
@Transactional
public class TestE extends AbstractTestNGSpringContextTests{

    @Autowired
    ERepository eRepository;

    @Test
    public void testD(){
        E e = new E();
        e.getNames().add("Jan");
        e.getNames().add("Tomasz");
        e.getNames().add("Ewa");
        e.getNames().add("Ania");
        e.getNames().add("Krystian");
        e.getNumbers().add(1950);
        e.getNumbers().add(1947);
        e.getNumbers().add(1994);
        e.getNumbers().add(1317);
        eRepository.save(e);
        E e1 = new E();
        e1.getNames().add("Raz");
        e1.getNames().add("Dwa");
        e1.getNumbers().add(15);
        e1.getNumbers().add(8);
        eRepository.save(e1);
    }
}
