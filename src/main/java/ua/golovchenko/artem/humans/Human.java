package ua.golovchenko.artem.humans;

import ua.golovchenko.artem.humans.clothes.Clothes;

/**
 * Created by головченко on 09.02.2017.
 */
public class Human {

    Clothes headdress;
    Clothes jacket;

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
