package com.patryk.zadanie2;

import com.patryk.zadanie2.Model.Aaa;
import com.patryk.zadanie2.Model.Bbb;
import com.patryk.zadanie2.Repository.AaaRepository;
import com.patryk.zadanie2.Repository.BbbRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.transaction.Transactional;
import java.util.List;

@SpringBootTest(classes=Zadanie2Application.class)
@Transactional
public class TestAaa extends AbstractTestNGSpringContextTests{

    @Autowired
    AaaRepository aaaRepository;
    @Autowired
    BbbRepository bbbRepository;

    @Test
    public void shouldSaveAaaAndBbbTest(){
        //given
        Aaa aaa1 = new Aaa();
        aaa1.setAutor("Adam Mickiewicz");
        aaaRepository.save(aaa1);
        Bbb bbb1 = new Bbb();
        bbb1.setTytul("Potop");
        bbb1.setAutor_id(aaa1.getId());
        Bbb bbb2 = new Bbb();
        bbb2.setTytul("Pan Tadeusz");
        bbb2.setAutor_id(aaa1.getId());
        Bbb bbb3 = new Bbb();
        bbb3.setTytul("Reduta Ordona");
        bbb3.setAutor_id(aaa1.getId());
        aaa1 = aaaRepository.findAll().get(0);

        Aaa aaa2 = new Aaa();
        aaa2.setAutor("Henryk Sienkiewicz");
        aaaRepository.save(aaa2);
        Bbb bbb4 = new Bbb();
        bbb4.setTytul("Quo Vadis");
        bbb4.setAutor_id(aaa2.getId());
        Bbb bbb5 = new Bbb();
        bbb5.setTytul("Krzyżacy");
        bbb5.setAutor_id(aaa2.getId());
        Bbb bbb6 = new Bbb();
        bbb6.setTytul("Pan Wołodyjowski");
        bbb6.setAutor_id(aaa2.getId());
        aaa2 = aaaRepository.findAll().get(0);

        //when
        List<Bbb> bbbList = aaa1.getBbb();
        bbbList.add(bbb1);
        bbbList.add(bbb2);
        bbbList.add(bbb3);
        bbbList = bbbRepository.save(bbbList);

        List<Bbb> bbb2List = aaa2.getBbb();
        bbb2List.add(bbb4);
        bbb2List.add(bbb5);
        bbb2List.add(bbb6);
        bbb2List = bbbRepository.save(bbb2List);

        //then
        Assert.assertNotNull(bbbList);
        Assert.assertEquals(bbbList.size(), 3);
    }

}
