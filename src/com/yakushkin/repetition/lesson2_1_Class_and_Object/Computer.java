package com.yakushkin.repetition.lesson2_1_Class_and_Object;

public class Computer {

    int ssd = 500;
    int ram = 1024;

    void load() {
        System.out.println("Я загрузился!");
    }

    void printState() {
        System.out.println("RAM " + ram);
        System.out.println("SSD " + ssd);
    }
}
