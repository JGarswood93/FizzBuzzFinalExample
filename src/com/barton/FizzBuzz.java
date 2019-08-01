package com.barton;
public class FizzBuzz {
    /**
     * This is the one that I have done from scratch
     */


    public static String getResult(int number) {
        if (number % 3 == 0)
            return "Fizz";

        if (number % 5 == 0)
            return "Buzz";

        else if (number % 15 == 0)

            return "FizzBuzz";

        return Integer.toString(number);

    }
    /**
     * Done this by myself pretty much the only thing that was missing
     * was the test for the normal numbers to come out as normal
     *
     * As well as the right kind of method to be used.
     *
     * Public static method to make the get result part which is the outcome
     * of the logic. the number variable initalised as an int is to allow the programme
     * to know that we are dealing with numbers here.
     *
     * So it is saying that if a number is divisable by three and nothing else i.e. no remainders
     * then print fizz, if five buzz if three and five fizzbuzz
     */

}