package com.dsa.streams.timetable;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        /**
         * Classic imperative implementation
         */
        Student carl = new Student(
                3713721,
                "Carl",
                "Karama", new Subject(1, "Maths"));

        Mark mathsScore = new Mark(1, 98);

        Map<Student, Mark> ranking = new HashMap<>();
        ranking.put(carl, mathsScore);

        /**
         * New declarative programming
         */
        Map<Student, Mark> streamRanking = Stream.of(carl).collect(Collectors.toMap(student -> student, student -> mathsScore));


    }
}
