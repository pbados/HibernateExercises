package com.patryk.zadanie2;

import com.patryk.zadanie2.Model.F;
import com.patryk.zadanie2.Repository.FRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import javax.transaction.Transactional;

@SpringBootTest(classes=Zadanie2Application.class)
@Transactional
public class TestF extends AbstractTestNGSpringContextTests{

    @Autowired
    FRepository fRepository;

    @Test
    public void testF(){
        F f = new F();
        f.setN1("Jan Kowalski");
        f.setI1(32);
        fRepository.save(f);
        F f1 = new F();
        f1.setN1("Piotr Nowak");
        f1.setI1(15);
        fRepository.save(f1);
        F f2 = new F();
        f2.setN1("Ewa Kowal");
        f2.setI1(22);
        fRepository.save(f2);
    }
}
