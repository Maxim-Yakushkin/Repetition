package com.yakushkin.repetition.lesson9_1_Static;

public class StaticRunner {
    public static void main(String[] args) {
        new Computer(null, null);
        new Computer(null, null);
        new Computer(null, null);
        Computer computer2 = new Computer(null, null);

        Computer computer = new Computer(null, null); //так делать неправильно!
        System.out.println(computer.getCounter());

        System.out.println(Computer.getCounter());

        Class<? extends Computer> clazz = computer.getClass();
        Class<? extends Computer> clazz2 = computer2.getClass();
        System.out.println(clazz == clazz2); // true

        System.out.println(computer == computer2); // false

        // Суть существования статических методов/полей на примере класса Math
        double pow = Math.pow(3, 2);
        System.out.println(pow);
    }
}
