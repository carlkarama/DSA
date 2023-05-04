package com.dsa.linkedlist;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");

        linkedList.remove("C");

        System.out.println(linkedList.toString());
    }
}
