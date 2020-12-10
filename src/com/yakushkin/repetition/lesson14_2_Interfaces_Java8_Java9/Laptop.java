package com.yakushkin.repetition.lesson14_2_Interfaces_Java8_Java9;

public final class Laptop extends Computer {

    private int weight;

    public Laptop() {
        System.out.println("Constructor Laptop");
    }

    public Laptop(Ram ram, Ssd ssd, int weight) {
        super(ram, ssd);
        this.weight = weight;
    }

    @Override
    public void load() {
        open();
        System.out.println("Laptop загрузился");
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Weight: " + weight);
    }

    public void open() {
        System.out.println("Открыл крышку");
    }

    public int getWeight() {
        return weight;
    }
}
