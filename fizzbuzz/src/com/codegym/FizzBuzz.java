package com.codegym;

public class FizzBuzz {
    public static String showFizzBuzz(int number) {
        boolean isDivisionBy3 = number % 3 == 0;
        boolean isDivisionBy5 = number % 5 == 0;
        if (isDivisionBy3 && isDivisionBy5) {
            return "FizzBuzz";
        } else if (isDivisionBy3) {
            return "Fizz";
        } else if (isDivisionBy5) {
            return "Buzz";
        }
        String result = "";
        return result + number;
    }
}
