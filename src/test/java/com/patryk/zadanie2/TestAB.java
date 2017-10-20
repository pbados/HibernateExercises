package com.patryk.zadanie2;

import com.patryk.zadanie2.Model.A;
import com.patryk.zadanie2.Model.B;
import com.patryk.zadanie2.Repository.ARepository;
import com.patryk.zadanie2.Repository.BRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.transaction.Transactional;

@SpringBootTest(classes=Zadanie2Application.class)
@Transactional
public class TestAB extends AbstractTestNGSpringContextTests {
    @Autowired
    ARepository aRepository;

    @Autowired
    BRepository bRepository;

    @Test
    public void test1(){
        A a1 = new A();
        B b1 = new B();
        A a2 = new A();
        B b2 = new B();
        a1.setNazwa("jeden");
        aRepository.save(a1);
        b1.setNazwa("dwa");
        bRepository.save(b1);
        a2.setNazwa("trzy");
        b2.setNazwa("cztery");
        aRepository.save(a2);
        bRepository.save(b2);
        Assert.assertEquals(1,1);
    }
}
