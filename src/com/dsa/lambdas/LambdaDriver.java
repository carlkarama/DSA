package com.dsa.lambdas;

public class LambdaDriver {

    public static void main(String[] args) {

        Formulae myFormulae = (p, r, y) ->  (p * r * y);

        myFormulae.compoundInterest(100000, 21, 11);

        System.out.println(myFormulae);

        Formulae ci = (principle, interestRate, years) -> {
            double rateOfInterest = 1 + (interestRate/100);
            double yield = Math.pow(rateOfInterest, years);
            double compoundInterest = principle * yield;

            return compoundInterest;
        };
    }
}