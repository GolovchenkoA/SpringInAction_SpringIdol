package com.springinaction.springidol;

import javax.sound.midi.Instrument;

/**
 * Created by головченко on 08.02.2017.
 */
public class Instrumentalist implements Performer {



    private String song;
    private com.springinaction.springidol.Instrument instrument;



    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String screamSong(){
        return song;
    }

    public void setInstrument(com.springinaction.springidol.Instrument instrument) {
        this.instrument = instrument;
    }

    @Override
    public void perform() throws PerformanceException {
        System.out.println("Playing: " + song + " : ");
        instrument.play();
    }
}
