package com.dsa.stack;

import java.util.Stack;

public class StackDriver {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("After stack:  " + stack); // prints the list of items in the stack

        System.out.println("Top of stack: " + stack.peek()); // finds the last value added to the stack

        System.out.println("Removes No:   " + stack.pop()); // removes the last value added to the stack i.e. 3

        System.out.println("After pop:    " + stack);
    }
}
