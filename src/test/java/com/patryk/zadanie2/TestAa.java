package com.patryk.zadanie2;

import com.patryk.zadanie2.Model.Aa;
import com.patryk.zadanie2.Model.Bb;
import com.patryk.zadanie2.Repository.AaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.transaction.Transactional;

@SpringBootTest(classes=Zadanie2Application.class)
@Transactional
public class TestAa extends AbstractTestNGSpringContextTests {

    @Autowired
    AaRepository aaRepository;
    @Autowired
    AaRepository bbRepository;

    @Test
    public void shouldSaveAaTest(){
        Aa panstwo_1 = new Aa();
        Aa panstwo_2 = new Aa();
        Aa panstwo_3 = new Aa();
        Bb stolica_1 = new Bb();
        Bb stolica_2 = new Bb();
        Bb stolica_3 = new Bb();

        panstwo_1.setPanstwo("Polska");
        panstwo_2.setPanstwo("Niemcy");
        panstwo_3.setPanstwo("Holandia");

        panstwo_1.setBb(stolica_1);
        stolica_1.setStolica("Warszawa");
        stolica_1.setAa(panstwo_1);
        aaRepository.save(panstwo_1);

        panstwo_2.setBb(stolica_2);
        stolica_2.setStolica("Berlin");
        stolica_2.setAa(panstwo_2);
        aaRepository.save(panstwo_2);

        panstwo_3.setBb(stolica_3);
        stolica_3.setStolica("Amsterdam");
        stolica_3.setAa(panstwo_3);
        aaRepository.save(panstwo_3);

        Assert.assertNotNull(aaRepository.findAll());
        Assert.assertNotNull(bbRepository.findAll());
    }
}
