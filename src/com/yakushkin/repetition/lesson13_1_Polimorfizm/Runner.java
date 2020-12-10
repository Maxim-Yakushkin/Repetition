package com.yakushkin.repetition.lesson13_1_Polimorfizm;

public class Runner {

    public static void main(String[] args) {
        Computer laptop = new Laptop(new Ram(1024), new Ssd(250), 2);
//        laptop.load();

//        System.out.println("-------------");

        Computer mobile = new Mobile(new Ram(125), new Ssd(512));
//        mobile.load();

        loadComputers(laptop, mobile);
        System.out.println("------------");
        printInfo(laptop, mobile);
    }

    public static void printInfo(Computer... computers) {
        for (Computer computer : computers) {
            computer.print();
            System.out.println();
        }
    }

    public static void loadComputers(Computer... computers) {
        for (Computer computer : computers) {
            computer.load();
            System.out.println();
        }
    }
}
