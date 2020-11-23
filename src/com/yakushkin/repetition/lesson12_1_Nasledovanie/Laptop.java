package com.yakushkin.repetition.lesson12_1_Nasledovanie;

public class Laptop extends Computer {

    private int weight;

    public Laptop(Ram ram, Ssd ssd, int weight) {
        super(ram, ssd);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public void load() {
        System.out.println("Laptop загрузился");
    }

    public void open() {
        System.out.println("Открыл крышку");
    }
}
