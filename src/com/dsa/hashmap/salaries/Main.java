package com.dsa.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        HashMap<String, Double> hashMap = new HashMap<>();
        hashMap.put("John Macklmyer", 100000.00);
        hashMap.put("Joe Bento", 95000.00);
        hashMap.put("Bobby Singer", 75000.00);
        hashMap.put("Lacy Dartmouth", 130000.00);
        hashMap.put("John Hopkins", 125000.00);

        for (Map.Entry<String, Double> hash: hashMap.entrySet()) {
            System.out.println("Salaries: " + hash.getValue());
        }
    }
}
