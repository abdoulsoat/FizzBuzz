package com.exemple.fizzbuzz.domain;

public class FizzBuzzCalculator {

    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";

    public String determinateFizzBuzz(int number) {
        StringBuilder stringBuilder = new StringBuilder();
        if (number % 3 == 0) {
            stringBuilder.append(FIZZ);
        }
        if (number % 5 == 0) {
            stringBuilder.append(BUZZ);
        }
        return stringBuilder.length() > 0 ? stringBuilder.toString() : String.valueOf(number);
    }
}
