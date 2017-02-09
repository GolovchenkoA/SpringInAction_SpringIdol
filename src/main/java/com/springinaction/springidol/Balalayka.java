package com.springinaction.springidol;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by головченко on 09.02.2017.
 */


public class Balalayka implements Instrument{


    @Override
    public void play() {
        System.out.println("Brin Brin Brin");
    }
}
