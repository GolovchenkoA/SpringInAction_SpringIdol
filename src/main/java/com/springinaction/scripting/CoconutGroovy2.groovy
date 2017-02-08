package com.springinaction.scripting

/**
 * Created by головченко on 08.02.2017.
 */

class CoconutGroovy2 implements com.springinaction.scripting.ICoconut {
    public void drinkThemBothUp() {
        println "You put the lime in the coconut..."
        println "and drink ‘em both up..."
        println "You put the lime in the coconut..."
        lime.drink()
    }
    com.springinaction.scripting.Lime lime;
}