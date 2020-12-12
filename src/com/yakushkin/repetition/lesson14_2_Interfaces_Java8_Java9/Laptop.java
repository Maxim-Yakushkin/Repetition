package com.yakushkin.repetition.lesson14_2_Interfaces_Java8_Java9;

public final class Laptop extends Computer {

    public Laptop(Ram ram, Ssd ssd) {
        super(ram, ssd);
    }

    @Override
    public void load() {
        System.out.println("Laptop загрузился");
    }
}
