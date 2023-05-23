package com.dsa.streams.billionaires;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Person> billionaires = new ArrayList<>();

        billionaires.add(new Person("Bill", "Gates", 100));
        billionaires.add(new Person("Mark", "Zuckerberg", 50));
        billionaires.add(new Person("Elon", "Musk", 250));
        billionaires.add(new Person("Jeff", "Bezos", 130));

        for (Person person : billionaires) {
            if (person.getBillions() >= 100) {
                System.out.println(person);
            }
        }

        /**
         * Streams implementation
         */

        List<Person> billionaireStreams = billionaires.stream()
                .filter(person -> person.getBillions() >= 100)
                .collect(Collectors.toList());

        billionaireStreams.forEach(person -> System.out.println(person.getFirstName() + " " + person.getLastName()));
    }
}
