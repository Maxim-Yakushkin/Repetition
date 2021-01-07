package com.yakushkin.repetition.lesson18_1_Generics_Teory;

import java.util.ArrayList;

public class Runner {

    public static void main(String[] args) {
        MyList<String> myList = new MyList<>(10);
        myList.add("String1");
        myList.add("String2");
        myList.add("String3");
        myList.add("String4");
        myList.add("String5");
        myList.add("String6");
        myList.add("String7");
        myList.add("String8");
        myList.add("String9");
        myList.add("String10");

        int index = 9;
        String element = myList.getElement(index);
        System.out.println("Элемент с индексом " + index + " = " + element.toUpperCase());
        System.out.println("--------------------------");
        System.out.println("Размер массива: " + myList.getSize());
    }
}
