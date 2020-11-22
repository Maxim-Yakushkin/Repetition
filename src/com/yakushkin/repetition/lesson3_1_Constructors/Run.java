package com.yakushkin.repetition.lesson3_1_Constructors;

public class Run {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.printState();

        System.out.println();

        Computer computer2 = new Computer(1050);
        computer2.printState();

        System.out.println();

        Computer computer3 = new Computer(1000, 10000);
        computer3.printState();
    }
}
