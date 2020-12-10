package com.yakushkin.repetition.lesson14_1_Interfaces;

public class Runner {

    public static void main(String[] args) {
        Computer laptop = new Laptop(new Ram(1024), new Ssd(250), 2);
        Computer mobile = new Mobile(new Ram(125), new Ssd(512));

        printInfo(laptop, mobile);
    }

    public static void printInfo(Printable... computers) {
        for (Printable computer : computers) {
            computer.print();
            System.out.println();
        }
    }
}
