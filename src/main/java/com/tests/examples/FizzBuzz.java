package com.tests.examples;

public class FizzBuzz {

    public String play(int number) {

        if(number % 3 == 0) return "Fizz";
        if(number % 5 == 0) return "Buzz";

        if(number == 0) throw new IllegalArgumentException("Number must not be 0");


        return String.valueOf(number);
    }
}
