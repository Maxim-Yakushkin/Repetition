package com.yakushkin.repetition.lesson14_1_Interfaces;

public final class Mobile extends Computer {

    public Mobile(Ram ram, Ssd ssd) {
        super(ram, ssd);
    }

    @Override
    public void load() {
        System.out.println("Mobile включился");
    }
}
