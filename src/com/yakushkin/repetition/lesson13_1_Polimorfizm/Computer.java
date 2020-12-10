package com.yakushkin.repetition.lesson13_1_Polimorfizm;

public abstract class Computer {

    private String type;
    private Ram ram;
    private Ssd ssd;

    public Computer() {
        System.out.println("Constructor Computer");
    }

    public Computer(Ram ram, Ssd ssd) {
        this.type = this.getClass().getSimpleName();
        this.ram = ram;
        this.ssd = ssd;
    }

    public abstract void load(); //метод без реализации, который обязательно нужно переопределить у наследников

    public void print() {
        System.out.println(type + "\nSSD:" + ssd.value + " " + "RAM: " + ram.value);
    }

    public Ram getRam() {
        return ram;
    }

    public Ssd getSsd() {
        return ssd;
    }
}
