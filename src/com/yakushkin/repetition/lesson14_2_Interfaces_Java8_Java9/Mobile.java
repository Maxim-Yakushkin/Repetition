package com.yakushkin.repetition.lesson14_2_Interfaces_Java8_Java9;

public final class Mobile extends Computer {

    public Mobile(Ram ram, Ssd ssd) {
        super(ram, ssd);
    }

    @Override
    public void load() {
        System.out.println("Mobile включился");
    }
}
