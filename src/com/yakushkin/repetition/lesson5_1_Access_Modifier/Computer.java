package com.yakushkin.repetition.lesson5_1_Access_Modifier;

public class Computer {

    private int ssd = 500;
    private long ram;

    public Computer() {
        System.out.println("Я был создан");
    }

    public Computer(int newSsd) {
        ssd = newSsd;
    }

    public Computer(int newSsd, long newRam) {
        ssd = newSsd;
        ram = newRam;
    }

    public Computer(long newRam, int newSsd) {
        ssd = newSsd;
        ram = newRam;
    }

    public void load() {
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

    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public long getRam() {
        return ram;
    }

    public void setRam(long ram) {
        this.ram = ram;
    }
}
