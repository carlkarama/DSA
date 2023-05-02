package com.dsa.staticFunctions;

public class Main {

    public static void main(String[] args) {

        /**
         * Helper functions consolidated into classes.
         * When needed instantiation of those classes are not required
         */
        int mySquare = Formulae.square(3);

        double ci = Formulae.compoundInterest(100000, 21, 5);

        System.out.println(ci);
    }
}
