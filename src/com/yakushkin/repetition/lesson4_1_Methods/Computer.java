package com.yakushkin.repetition.lesson4_1_Methods;

public class Computer {

    int ssd = 500;
    long ram;

    Computer() {
        System.out.println("Я был создан");
    }

    Computer(int newSsd) {
        ssd = newSsd;
    }

    Computer(int newSsd, long newRam) {
        ssd = newSsd;
        ram = newRam;
    }

    Computer(long newRam, int newSsd) {
        ssd = newSsd;
        ram = newRam;
    }

    void load() {
        System.out.println("Я загрузился!");
    }

    void load(boolean open) {
        System.out.println("Я загрузился!");
        if (open) {
            System.out.println("Крышка открыта");
        }
    }

    void printState() {
        System.out.println("SSD " + ssd);
        System.out.println("RAM " + ram);
    }
}
