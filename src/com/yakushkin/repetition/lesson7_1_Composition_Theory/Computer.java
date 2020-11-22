package com.yakushkin.repetition.lesson7_1_Composition_Theory;

public class Computer {

    private Ram ram;
    private Ssd ssd;

    public Computer(Ram ram, Ssd ssd) {
        this.ram = ram;
        this.ssd = ssd;
    }

    public void printState() {
        System.out.println("Computer RAM: " + ram.getValue() + "\nComputer SSD: " + ssd.getValue());
    }
}
