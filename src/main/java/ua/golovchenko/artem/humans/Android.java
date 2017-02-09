package ua.golovchenko.artem.humans;

import com.springinaction.springidol.Instrument;
import com.springinaction.springidol.qualifiers.StringedInstrument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import ua.golovchenko.artem.humans.clothes.Clothes;
import ua.golovchenko.artem.humans.clothes.jackets.LeatherJacket;

/**
 * Created by головченко on 09.02.2017.
 */

public class Android {

    @Autowired
    Instrument instrument;

    @Autowired
    @Qualifier("mega_balalayka")
    Instrument instrument2;

    @Autowired
    @StringedInstrument
    Instrument instrument3;

    public Android(){}


    public Android(Instrument instrument) {
        this.instrument = instrument;
    }

    public Android(Instrument instrument, Instrument instrument2) {
        this.instrument = instrument;
        this.instrument2 = instrument2;
    }

    public void iPlayOn(){
        instrument.play();
        instrument2.play();
        instrument3.play();
    }
}
