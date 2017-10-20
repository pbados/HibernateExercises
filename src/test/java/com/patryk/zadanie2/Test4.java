package com.patryk.zadanie2;

import com.patryk.zadanie2.Model.C;
import com.patryk.zadanie2.Model.Color;
import com.patryk.zadanie2.Repository.CRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import javax.transaction.Transactional;
import java.time.LocalDate;

@SpringBootTest(classes=Zadanie2Application.class)
@Transactional
public class Test4 extends AbstractTestNGSpringContextTests {

    @Autowired
    CRepository cRepository;

    @Test
    public void test4() {

        C c = new C();
        c.setName("Adam");
        c.setColor(Color.CZERWONY);
        c.setMyDate(LocalDate.now());
        c.setMyDate2(LocalDate.now());
        cRepository.save(c);
        Assert.assertEquals(c.getMyDate(), LocalDate.now());
    }
}