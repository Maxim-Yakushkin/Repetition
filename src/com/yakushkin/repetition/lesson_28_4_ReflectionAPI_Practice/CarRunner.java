package com.yakushkin.repetition.lesson_28_4_ReflectionAPI_Practice;

public class CarRunner {
    public static void main(String[] args) throws NoSuchFieldException {
        Car toyota = new Car("Toyota", "Corolla");
        Car car = new Car();
        System.out.println(toyota.getBrand() + " " + toyota.getModel());

        System.out.println(car.getBrand() + " " + car.getModel());
    }
}
