package com.yakushkin.repetition.lesson12_1_Nasledovanie;

public class Runner {
    public static void main(String[] args) {
        Laptop laptop = new Laptop(new Ram(2048), new Ssd(512), 1);

        laptop.open();
        laptop.load();
    }
}
