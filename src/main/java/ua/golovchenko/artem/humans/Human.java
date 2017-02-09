package ua.golovchenko.artem.humans;

import org.springframework.beans.factory.annotation.Autowired;
import ua.golovchenko.artem.humans.clothes.Clothes;

/**
 * Created by головченко on 09.02.2017.
 */


public class Human {

    Clothes headdress;
    Clothes jacket;

    public Human(){    }

    public Human(Clothes headdress, Clothes jacket) {
        this.headdress = headdress;
        this.jacket = jacket;
    }

    public void setHeaddress(Clothes headdress) {
        this.headdress = headdress;
    }

    public void setJacket(Clothes jacket) {
        this.jacket = jacket;
    }

    public void meDressedIn(){
        System.out.println("Me dressed in: " + headdress.information() + " and " + jacket.information());
    }
}
