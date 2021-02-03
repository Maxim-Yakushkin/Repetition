package com.yakushkin.repetition.lesson_26_6_Synchronized_Collections_CASHBOX_2;

public class CashBox {

    private static int generator = 1;
    private int id;

    public CashBox() {
        this.id = generator++;
    }

    @Override
    public String toString() {
        return "CashBox{" +
                "id=" + id +
                '}';
    }
}
