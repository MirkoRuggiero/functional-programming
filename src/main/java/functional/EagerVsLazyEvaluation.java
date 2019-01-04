package functional;

import java.util.function.Function;

public class EagerVsLazyEvaluation {

    public static void main(String[] args) {

        //Both method square and cube are invoked each time we invoke the ifThenElse method (eager evaluation by Java)
        System.out.printf("%d%n", ifThenElse(true, square(4), cube(4)));
        System.out.printf("%d%n", ifThenElse(false, square(4), cube(4)));

        //Only one function is evaluated when we invoke the ifThenElse method (lazy functional evaluation)
        System.out.printf("%d%n", ifThenElse(true, square, cube, 4));
        System.out.printf("%d%n", ifThenElse(false, square, cube, 4));
    }

    /**
     * Lazy evaluation with functional programming
     */
    private static Function<Integer, Integer> square = t -> {
        System.out.println("Square function");
        return t * t;
    };
    private static Function<Integer, Integer> cube = t -> {
        System.out.println("Cube function");
        return t * t * t;
    };

    private static <T, R> R ifThenElse(boolean predicate, Function<T, R> onTrue, Function<T, R> onFalse, T t) {
        return (predicate) ? onTrue.apply(t) : onFalse.apply(t);
    }

    /**
     * Eager evaluation with normal Java methods
     */
    private static int cube(int x) {
        System.out.println("Java method 'cube'");
        return x * x * x;
    }

    private static int square(int x) {
        System.out.println("Java method 'square'");
        return x * x;
    }

    private static int ifThenElse(boolean predicate, int onTrue, int onFalse) {
        return (predicate) ? onTrue : onFalse;
    }
}
