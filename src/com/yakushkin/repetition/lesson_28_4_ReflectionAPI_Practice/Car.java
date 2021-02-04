package com.yakushkin.repetition.lesson_28_4_ReflectionAPI_Practice;

@Table(name = "car")
public class Car {

    @Column(name = "brandDB")
    private String brand;

    @Column(name = "modelDB")
    private String model;

    public Car() throws NoSuchFieldException {
        this.brand=Car.class.getDeclaredField("brand").getAnnotation(Column.class).name();
        this.model=Car.class.getDeclaredField("model").getAnnotation(Column.class).name();
    }

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
