package com.yakushkin.repetition.lesson5_1_Access_Modifier;

public class Run {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.printState();

        System.out.println();

        Computer computer2 = new Computer(1050);
        computer2.printState();

        System.out.println();

        Computer computer3 = new Computer(1000, 10000L);
        computer3.printState();

        System.out.println();

        Computer computer4 = new Computer(512L, 1024);
        computer4.printState();
        computer4.load();
        computer4.load(true);
    }
}
