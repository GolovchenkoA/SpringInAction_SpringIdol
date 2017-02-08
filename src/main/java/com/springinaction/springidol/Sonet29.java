package com.springinaction.springidol;

/**
 * Created by головченко on 08.02.2017.
 */
public class Sonet29 implements Poem {

    private static String[] LINES = {
            "Когда в раздоре с миром и судьбой,",
            "Припомнив годы, полные невзгод,"
    };

    @Override
    public void recite() {
        for(int i = 0; i < LINES.length; i++){
            System.out.println(LINES[i]);
        }
    }
}
