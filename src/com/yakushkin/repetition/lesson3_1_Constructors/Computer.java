package com.yakushkin.repetition.lesson3_1_Constructors;

public class Computer {

    int ssd = 500;
    int ram;

    Computer() {
        System.out.println("Я был создан");
    }

    Computer(int newSsd) {
        ssd = newSsd;
    }

    Computer(int newSsd, int newRam) {
        ssd = newSsd;
        ram = newRam;
    }

    void load() {
        System.out.println("Я загрузился!");
    }

    void printState() {
        System.out.println("SSD " + ssd);
        System.out.println("RAM " + ram);
    }
}
