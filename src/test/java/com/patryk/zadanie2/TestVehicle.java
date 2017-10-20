package com.patryk.zadanie2;

import com.patryk.zadanie2.Model.Bike;
import com.patryk.zadanie2.Model.Car;
import com.patryk.zadanie2.Model.Color;
import com.patryk.zadanie2.Repository.BikeRepository;
import com.patryk.zadanie2.Repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import javax.transaction.Transactional;

@SpringBootTest(classes=Zadanie2Application.class)
@Transactional
public class TestVehicle extends AbstractTestNGSpringContextTests{

    @Autowired
    CarRepository carRepository;

    @Autowired
    BikeRepository bikeRepository;

    @Test
    public void testV(){
        Car c = new Car();
        c.setMyColor(Color.ZIELONY);
        c.setName("Fiat");
        carRepository.save(c);

        Car c1 = new Car();
        c1.setMyColor(Color.NIEBIESKI);
        c1.setName("Audi");
        carRepository.save(c1);

        Car c2 = new Car();
        c2.setMyColor(Color.CZERWONY);
        c2.setName("Renault");
        carRepository.save(c2);

        Car c3 = new Car();
        c3.setMyColor(Color.CZERWONY);
        c3.setName("Porsche");
        carRepository.save(c3);

        Bike b = new Bike();
        b.setNumber(new Long(231));
        bikeRepository.save(b);

        Bike b2 = new Bike();
        b2.setNumber(new Long(232));
        bikeRepository.save(b2);

        Bike b3 = new Bike();
        b3.setNumber(new Long(18));
        bikeRepository.save(b3);

        Bike b4 = new Bike();
        b4.setNumber(new Long(107));
        bikeRepository.save(b4);
    }
}