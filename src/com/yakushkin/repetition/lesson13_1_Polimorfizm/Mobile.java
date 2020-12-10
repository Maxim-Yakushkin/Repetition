package com.yakushkin.repetition.lesson13_1_Polimorfizm;

public final class Mobile extends Computer {

    public Mobile(Ram ram, Ssd ssd) {
        super(ram, ssd);
    }

    @Override
    public void load() {
        System.out.println("Mobile включился");
    }
}
