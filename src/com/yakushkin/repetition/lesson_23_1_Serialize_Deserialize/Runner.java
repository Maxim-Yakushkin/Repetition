package com.yakushkin.repetition.lesson_23_1_Serialize_Deserialize;

import java.io.*;
import java.nio.file.Path;

public class Runner {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Path path = Path.of("resources", "person.out");
        serializeObjectInFile(path);
        deserializeObjectFromFile(path);
    }

    private static void deserializeObjectFromFile(Path path) throws IOException, ClassNotFoundException {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path.toFile()))) {
            Person person = (Person) objectInputStream.readObject();
            System.out.println(person.name + " " + person.lastName + " " + person.age);
        }
    }

    private static void serializeObjectInFile(Path path) throws IOException {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path.toFile()))) {
            Person person = new Person("Maxim", "Yakushkin", 26);
            objectOutputStream.writeObject(person);
        }
    }
}
