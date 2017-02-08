/**
 * Created by головченко on 09.02.2017.
 */

class CoconutGroovy implements com.springinaction.scripting.ICoconut {
    public void drinkThemBothUp() {
        println "You put the lime in the coconut..."
        println "and drink ‘em both up..."
        println "You put the lime in the coconut..."
        lime.drink()
    }
    com.springinaction.scripting.Lime lime;
}
