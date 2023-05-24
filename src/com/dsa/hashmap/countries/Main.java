package com.dsa.hashmap.countries;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        HashMap<String, List<String>> countries = new LinkedHashMap<>();
        
        List<String> A = new ArrayList<String>();
        A.add("Angola");
        A.add("Australia");
        A.add("Angola");

        List<String> B = new ArrayList<String>();
        B.add("Burundi");
        B.add("Botswana");
        B.add("Benin");

        List<String> C = new ArrayList<String>();
        C.add("Canada");
        C.add("China");
        C.add("Chad");

        countries.put("A", A);
        countries.put("B", B);
        countries.put("C", C);

        // Print all the alphabets of the countries first letter
        for (String country : countries.keySet()) {
            System.out.println(country);
        }

        // Print all the country names
        for (List country : countries.values()) {
            System.out.println(country);
        }
    }
}
