package com.springinaction.springidol;

import com.springinaction.springidol.qualifiers.StringedInstrument;

/**
 * Created by головченко on 09.02.2017.
 */

@StringedInstrument
public class Bandura implements Instrument {

    @Override
    public void play() {
        System.out.println("bandura bandura");
    }
}
