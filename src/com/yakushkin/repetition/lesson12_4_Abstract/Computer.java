package com.yakushkin.repetition.lesson12_4_Abstract;

public abstract class Computer {

    private Ram ram;
    private Ssd ssd;

    //блок инициализации
    {
        System.out.println("init block Computer");
    }
    //static блок инициализации
    //создается и вызывается только один раз
    static {
        System.out.println("static init block Computer");
    }

    public Computer() {
        System.out.println("Constructor Computer");
    }

    public Computer(Ram ram, Ssd ssd) {
        this.ram = ram;
        this.ssd = ssd;
    }

    public abstract void load(); //метод без реализации, который обязательно нужно переопределить у наследников

//    public void load() {
//        System.out.println("Я загрузился!");
//    }

    public Ram getRam() {
        return ram;
    }

    public Ssd getSsd() {
        return ssd;
    }
}
