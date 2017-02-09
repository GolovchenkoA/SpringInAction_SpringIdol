package ua.golovchenko.artem.humans;

import com.springinaction.springidol.Instrument;
import org.springframework.beans.factory.annotation.Autowired;
import ua.golovchenko.artem.humans.clothes.Clothes;
import ua.golovchenko.artem.humans.clothes.jackets.LeatherJacket;

/**
 * Created by головченко on 09.02.2017.
 */

public class Android {


    Instrument instrument;

    public Android(){}

    @Autowired
    public Android(Instrument instrument) {
        this.instrument = instrument;
    }


    public void iPlayOn(){
        instrument.play();
    }
}
