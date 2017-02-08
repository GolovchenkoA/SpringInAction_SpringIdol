package com.springinaction.springidol;

import java.util.Collection;

/**
 * Created by головченко on 08.02.2017.
 */
public class OneManBand implements Performer {

    private Collection<Instrument> instruments;

    public void setInstruments(Collection<Instrument> instruments) {
        this.instruments = instruments;
    }

    @Override
    public void perform() throws PerformanceException {

        for (Instrument instrument:instruments){
            instrument.play();
        }

    }
}
