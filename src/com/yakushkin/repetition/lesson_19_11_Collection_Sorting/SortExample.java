package com.yakushkin.repetition.lesson_19_11_Collection_Sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("123", "345", "14", "678");
        Collections.sort(strings);
        strings.forEach(x -> System.out.printf("%s ", x));
        System.out.println();

        List<Person> personList = Arrays.asList(
                new Person(1, "Ivan", "Ivanov"),
                new Person(3, "Sveta", "Svetikova"),
                new Person(2, "Petr", "Petrov")
        );
        System.out.println(personList);
        Collections.sort(personList);
        System.out.println(personList);

//        personList.sort(new FirstNameComparator());
        personList.sort(Comparator.comparing(Person::getFirstName)); // c Java 1.8

        System.out.println(personList);
    }

    public static class FirstNameComparator implements Comparator<Person> {

        @Override
        public int compare(Person person1, Person person2) {
            return person1.firstName.compareTo(person2.firstName);
        }
    }
}
