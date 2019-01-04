package functional;

import java.util.function.Function;
import java.util.function.Predicate;

/**
 * PureFunction class
 * A pure function is a function that depends only on its arguments and no external or internal state.
 * It means that there are no side effects.
 * Given the same input, it will return always the same output
 */
public class PureFunction {

    private static Function<Integer, Boolean> isBissextile = year -> (year % 100 != 0 && year % 4 == 0) || (year % 100 == 0 && year % 400 == 0);

    private static Predicate<Integer> isBissextilePredicate = year -> (year % 100 != 0 && year % 4 == 0) || (year % 100 == 0 && year % 400 == 0);

    public static void main(String[] args) {
        System.out.println("Year 2018 is" + (isBissextile.apply(2018) ? "" : " not") + " bissextile");
        System.out.println("Year 2019 is" + (isBissextile.apply(2019) ? "" : " not") + " bissextile");
        System.out.println("Year 2020 is" + (isBissextile.apply(2020) ? "" : " not") + " bissextile");
        System.out.println("Year 1879 is" + (isBissextile.apply(1879) ? "" : " not") + " bissextile");
        System.out.println("Year 746 is" + (isBissextile.apply(746) ? "" : " not") + " bissextile");
        System.out.println("Year 1942 is" + (isBissextile.apply(1942) ? "" : " not") + " bissextile");
        System.out.println("Year 1600 is" + (isBissextile.apply(1600) ? "" : " not") + " bissextile");

        /**
         * Java give us also the Predicate<T> functional interface, with the test() method to evaluate the predicate and return a boolean
         */
        System.out.println("Year 2018 is" + (isBissextilePredicate.test(2018) ? "" : " not") + " bissextile");
        System.out.println("Year 2019 is" + (isBissextilePredicate.test(2019) ? "" : " not") + " bissextile");
        System.out.println("Year 2020 is" + (isBissextilePredicate.test(2020) ? "" : " not") + " bissextile");
        System.out.println("Year 1879 is" + (isBissextilePredicate.test(1879) ? "" : " not") + " bissextile");
        System.out.println("Year 746 is" + (isBissextilePredicate.test(746) ? "" : " not") + " bissextile");
        System.out.println("Year 1942 is" + (isBissextilePredicate.test(1942) ? "" : " not") + " bissextile");
        System.out.println("Year 1600 is" + (isBissextilePredicate.test(1600) ? "" : " not") + " bissextile");
    }
}
