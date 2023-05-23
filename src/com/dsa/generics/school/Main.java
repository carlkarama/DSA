package com.dsa.generics.school;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Student carl = new Student(300938928, "Carl Karama", "College Student");
        Student bobby = new Student(300938528, "Bobby Coles", "High School Student");


        Roll roll = new Roll();
        roll.studentType(carl);

    }
}
