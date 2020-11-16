package com.prarefactoringvar;

public class FizzBuzzz {
    public static String fizzBuzz(int number) {
        boolean isFizz = number % 3 == 0;
        boolean isBuzz = number % 5 == 0;
        if (isFizz && isBuzz)
            return "FizzBuzz";
        if (isFizz)
            return "Fizz";
        if (isBuzz)
            return "Bizz";
        return number + "";
    }
}
