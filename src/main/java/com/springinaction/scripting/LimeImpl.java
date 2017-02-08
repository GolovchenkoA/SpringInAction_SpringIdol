package com.springinaction.scripting;

/**
 * Created by головченко on 08.02.2017.
 */
public class LimeImpl implements Lime {
    public LimeImpl(){}

    @Override
    public void drink() {
        System.out.println("Called the doctor woke him up!");
    }
}
