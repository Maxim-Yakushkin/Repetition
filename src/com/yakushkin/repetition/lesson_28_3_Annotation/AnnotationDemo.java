package com.yakushkin.repetition.lesson_28_3_Annotation;

public class AnnotationDemo {
    public static void main(String[] args) throws NoSuchFieldException {
        User ivan = new User(1, "Ivan", 15);
        User petr = new User(2, "Petr");
        System.out.println(ivan.getMinAge());
        System.out.println(petr.getMinAge());
    }
}
