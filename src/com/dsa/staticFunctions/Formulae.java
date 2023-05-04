package com.dsa.staticFunctions;

public class Formulae {

    public static int square(int number) {
        return number * number;
    }

    public static double compoundInterest(double principle, double rate, int years) {
        // C.I = Principle * (1+rate/100)^n
        double rateOfInterest = 1 + (rate/100);
        double yield = Math.pow(rateOfInterest, years);
        double compoundInterest = yield * principle;
        return compoundInterest;
    }
}
