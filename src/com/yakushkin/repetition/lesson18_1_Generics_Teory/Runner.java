package com.yakushkin.repetition.lesson18_1_Generics_Teory;

public class Runner {

    public static void main(String[] args) {
        MyList<String> myList = new MyList<>(10);
        myList.add("String1");
        myList.add("String2");
        myList.add("String3");

        String element = myList.getElement(1);
        System.out.println(element.toUpperCase());
    }
}
