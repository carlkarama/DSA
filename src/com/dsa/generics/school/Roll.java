package com.dsa.generics.school;

public class Roll implements Attendance<Student> {


    public Roll() {
    }

    @Override
    public int studentType(Student members) {
        return 0;
    }
}
