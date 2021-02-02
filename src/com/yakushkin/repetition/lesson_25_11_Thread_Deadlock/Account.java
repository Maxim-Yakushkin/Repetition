package com.yakushkin.repetition.lesson_25_11_Thread_Deadlock;

public class Account {

    private static int generator = 1;
    private int id;
    private int money;

    public Account(int money) {
        this.id = generator++;
        this.money = money;
    }

    public void addMoney(int money) {
        this.money += money;
    }

    public boolean takeOffMoney(int money) {
        if (this.money >= money) {
            this.money -= money;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", money=" + money +
                '}';
    }
}
