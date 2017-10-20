package com.patryk.zadanie2;

import com.patryk.zadanie2.Model.C;
import com.patryk.zadanie2.Model.Color;
import com.patryk.zadanie2.Repository.CRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import javax.transaction.Transactional;
import java.time.LocalDate;

@SpringBootTest(classes=Zadanie2Application.class)
@Transactional
public class TestC extends AbstractTestNGSpringContextTests{

    @Autowired
    CRepository cRepository;

    @Test
    public void testC(){
        C c = new C();
        c.setName("Patryk");
        c.setColor(Color.CZERWONY);
        c.setMyDate(LocalDate.of(1994, 5, 7));
        c.setMyDate2(LocalDate.of(1995, 2, 26));
        cRepository.save(c);
        C c1 = new C();
        c1.setName("Jan");
        c1.setColor(Color.NIEBIESKI);
        c1.setMyDate(LocalDate.now());
        c1.setMyDate2(LocalDate.of(1999,2,2));
        cRepository.save(c1);
        C c2 = new C();
        c2.setName("Krystian");
        c2.setColor(Color.CZERWONY);
        c2.setMyDate(LocalDate.of(1996, 5, 9));
        c2.setMyDate2(LocalDate.of(1975, 12, 25));
        cRepository.save(c2);
        C c3 = new C();
        c3.setName("Ewa");
        c3.setColor(Color.ZIELONY);
        c3.setMyDate(LocalDate.of(1924, 1, 1));
        c3.setMyDate2(LocalDate.of(2005, 8, 1));
        cRepository.save(c3);
    }
}
