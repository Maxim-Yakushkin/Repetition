package com.yakushkin.repetition.lesson12_3_Object;

public class Runner {
    public static void main(String[] args) {

        new Laptop();
        System.out.println();
        System.out.println("static больше не вызывается, т.к. создается и вызывается только один раз");
        System.out.println();
        new Laptop();
    }
}
