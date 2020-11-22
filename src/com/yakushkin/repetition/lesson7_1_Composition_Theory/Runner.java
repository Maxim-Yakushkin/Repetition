package com.yakushkin.repetition.lesson7_1_Composition_Theory;

public class Runner {
    public static void main(String[] args) {
        Ram ram = new Ram(1000);
        Ssd ssd = new Ssd(512);
        Computer computer = new Computer(ram, ssd);
        computer.printState();
    }
}
