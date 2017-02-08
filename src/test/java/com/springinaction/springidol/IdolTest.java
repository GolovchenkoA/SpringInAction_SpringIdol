package com.springinaction.springidol;

import static org.junit.Assert.*;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;


import static java.lang.System.setProperty;

/**
 * Created by головченко on 08.02.2017.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration( {"classpath:spring-idol.xml" })
public class IdolTest {

    /*@BeforeClass
    public static void setup() {
        setProperty("STANS_SONG", "Total IntellijIDEA of the Heart");
    }*/

    @Autowired
    ApplicationContext context;

    @Test
    public void dukeJugglingBeanbags() throws PerformanceException {
        Juggler duke = (Juggler) context.getBean("duke");
        assertEquals("JUGGLING 3 BEANBAGS",duke.performText());
    }
}
