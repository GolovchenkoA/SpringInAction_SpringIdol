package com.springinaction.scripting;

/**
 * Created by головченко on 08.02.2017.
 */
public class Coconut {
    public Coconut() {}
    public void drinkThemBothUp() {
        System.out.println("You put the lime in the coconut...");
        System.out.println("and drink ‘em both up...");
        System.out.println("You put the lime in the coconut...");
        lime.drink(); // Вызов метода drink() интерфейса com.springinaction.scripting.Lime
    }
    // Внедряемый компонент
    private Lime lime; // Для внедрения
    public void setLime(Lime lime) { // реализации
        this.lime = lime; // интерфейса com.springinaction.scripting.Lime
    }
}
