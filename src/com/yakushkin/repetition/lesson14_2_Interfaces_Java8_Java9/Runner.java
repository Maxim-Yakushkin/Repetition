package com.yakushkin.repetition.lesson14_2_Interfaces_Java8_Java9;

public class Runner {

    public static void main(String[] args) {
        Computer laptop = new Laptop(new Ram(1024), new Ssd(250), 2);
        Computer mobile = new Mobile(new Ram(125), new Ssd(512));

        printWithRandom(laptop, mobile);
    }

    public static void printWithRandom(Printable... computers) {
        for (Printable computer : computers) {
            computer.printWithRandom();
            System.out.println();
        }
    }
}
