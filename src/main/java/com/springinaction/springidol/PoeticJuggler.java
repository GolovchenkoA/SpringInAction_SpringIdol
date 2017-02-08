package com.springinaction.springidol;

/**
 * Created by головченко on 08.02.2017.
 */
public class PoeticJuggler extends Juggler {

    Poem poem;

    public PoeticJuggler(Poem poem) {
        this.poem = poem;
    }

    public PoeticJuggler(int beanBags, Poem poem) {
        super(beanBags);
        this.poem = poem;
    }

    @Override
    public void perform() throws PerformanceException {
        System.out.println();
        super.perform();
        poem.recite();
    }
}
