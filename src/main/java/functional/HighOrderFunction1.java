package functional;

import java.util.function.Function;

/**
 * HighOrderFunction1 class
 * Higher-order functions, aka first-class functions are functions that receive function arguments and/or returns a function result
 * See also function composition
 */
public class HighOrderFunction1 {

    private static Function<Integer, Function<Integer, Integer>> partialSum = x -> y -> x + y; //First class function. It returns a function

    public static void main(String[] args) {

        /**
         * In this function we can observe the "currying", a way to translate a multi-argument function's evaluation
         * into the evaluation of an equivalent sequence of single-argument functions
         *
         * This is also close to the concept of closure
         */
        Function<Integer, Integer> sum10 = partialSum.apply(10); //return a function that sum 10 to a integer


        System.out.println("sum10.apply(5) : " + sum10.apply(5));
        System.out.println("sum10.apply(10) : " + sum10.apply(10));
        System.out.println("sum10.apply(11) : " + sum10.apply(11));
        System.out.println("sum10.apply(6) : " + sum10.apply(6));

    }

}
