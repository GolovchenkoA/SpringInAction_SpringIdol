package ua.golovchenko.artem.humans.clothes.jackets;

import org.springframework.context.annotation.Bean;
import ua.golovchenko.artem.humans.clothes.Clothes;

/**
 * Created by головченко on 09.02.2017.
 */

public class Coat implements Clothes {

    @Override
    public String information() {
        return "Coat";
    }
}
