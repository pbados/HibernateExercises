package com.patryk.zadanie2;

import com.patryk.zadanie2.Model.D;
import com.patryk.zadanie2.Repository.DRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import javax.transaction.Transactional;

@SpringBootTest(classes=Zadanie2Application.class)
@Transactional
public class TestD extends AbstractTestNGSpringContextTests{

    @Autowired
    DRepository dRepository;

    @Test
    public void testD(){
        D d = new D();
        d.getNames().add("Jan");
        d.getNames().add("Tomasz");
        d.getNames().add("Ewa");
        d.getNames().add("Ania");
        d.getNames().add("Krystian");
        d.getNumbers().add(1950);
        d.getNumbers().add(1947);
        d.getNumbers().add(1994);
        d.getNumbers().add(1317);
        dRepository.save(d);
    }
}
