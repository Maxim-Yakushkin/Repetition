package com.yakushkin.repetition.lesson12_1_Nasledovanie;

public class Computer {

    private Ram ram;
    private Ssd ssd;

    public Computer(Ram ram, Ssd ssd) {
        this.ram = ram;
        this.ssd = ssd;
    }

    public Ram getRam() {
        return ram;
    }

    public Ssd getSsd() {
        return ssd;
    }

    public void load() {
        System.out.println("Я загрузился!");
    }
}
