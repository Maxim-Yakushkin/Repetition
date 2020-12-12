package com.yakushkin.repetition.lesson14_2_Interfaces_Java8_Java9;

public abstract class Computer implements Printable {

    private final String type;
    private final Ram ram;
    private final Ssd ssd;


    public Computer(Ram ram, Ssd ssd) {
        this.type = this.getClass().getSimpleName();
        this.ram = ram;
        this.ssd = ssd;
    }

    public abstract void load(); //метод без реализации, который обязательно нужно переопределить у наследников

    @Override
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
