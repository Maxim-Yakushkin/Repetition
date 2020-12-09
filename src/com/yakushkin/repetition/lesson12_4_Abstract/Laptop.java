package com.yakushkin.repetition.lesson12_4_Abstract;

public final class Laptop extends Computer {

    private int weight;

    //блок инициализации
    {
        System.out.println("init block Laptop");
    }
    //создается и вызывается только один раз
    static {
        System.out.println("static init block Laptop");
    }

    public Laptop() {
        System.out.println("Constructor Laptop");
    }

    public Laptop(Ram ram, Ssd ssd, int weight) {
        super(ram, ssd);
        this.weight = weight;
    }

    @Override
    public void load() {
        System.out.println("Laptop загрузился");
    }

    public void open() {
        System.out.println("Открыл крышку");
    }

    public int getWeight() {
        return weight;
    }
}
