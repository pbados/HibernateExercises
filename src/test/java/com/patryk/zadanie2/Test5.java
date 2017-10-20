package com.patryk.zadanie2;

import com.patryk.zadanie2.Model.C;
import com.patryk.zadanie2.Model.Color;
import com.patryk.zadanie2.Repository.CRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.math.BigInteger;
import java.time.LocalDate;

@SpringBootTest(classes=Zadanie2Application.class)
@Transactional
public class Test5 extends AbstractTestNGSpringContextTests{

    @Autowired
    CRepository cRepositroy;

    @Autowired
    EntityManager entityManager;

    @Test
    public void test5(){
        C c1 = new C();
        C c2 = new C();
        C c3 = new C();
        c1.setName("ASDF");
        c1.setColor(Color.CZERWONY);
        c1.setMyDate(LocalDate.of(1994, 5, 7));
        c1.setMyDate2(LocalDate.of(1995, 2, 26));
        cRepositroy.save(c1);
        c2.setName("ASDF");
        c2.setColor(Color.NIEBIESKI);
        c2.setMyDate(LocalDate.of(2004, 5, 7));
        c2.setMyDate2(LocalDate.of(2005, 2, 26));
        cRepositroy.save(c2);
        c3.setName("ASDF2");
        c3.setColor(Color.CZERWONY);
        c3.setMyDate(LocalDate.of(1999, 12, 31));
        c3.setMyDate2(LocalDate.of(2000, 1, 1));
        cRepositroy.save(c3);

        //5-b-i
        //Assert.assertEquals(cRepositroy.ile(), 3);

        //5-b-ii
        Query query = entityManager.createNativeQuery("Select COUNT(c.name)FROM C");
        int count = ((BigInteger)query.getSingleResult()).intValue();
        Assert.assertEquals(count,3);

        //5-b-iii
        //Assert.assertEquals(cRepositroy.findAll().size(), 3);

        //5-c-i
        //Assert.assertEquals(cRepositroy.ile2(), 2);

        //5-c-ii
        //Assert.assertEquals(cRepositroy.col().size(), 3);

        //5-c-iii
        //Assert.assertEquals(cRepositroy.findByName("ASDF").size(),2);

    }

}
