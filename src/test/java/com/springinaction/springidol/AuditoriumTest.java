package com.springinaction.springidol;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * Created by головченко on 08.02.2017.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration( {"classpath:spring-idol.xml" })
public class AuditoriumTest {

    @Autowired
    ApplicationContext context;

    @Test
    public void whenLightOnThenTrue(){
        Auditorium auditorium = (Auditorium) context.getBean("theAuditorium");
        auditorium.turnLightOn();
        assertTrue(auditorium.getLightOn());
    }

    @Test
    public void whenLightOffThenFalse(){
        Auditorium auditorium = (Auditorium) context.getBean("theAuditorium");
        auditorium.turnLightOff();
        assertFalse(auditorium.getLightOn());
    }

}
