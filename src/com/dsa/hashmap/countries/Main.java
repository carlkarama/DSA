package com.dsa.hashmap.countries;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

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

	
    }
}
