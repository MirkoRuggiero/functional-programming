package functional.functors;

import java.util.function.Function;

public class FOptional<T> implements Functor<T, FOptional<?>> {

    private final T valueOrNull;

    private FOptional(T valueOrNull) {
        this.valueOrNull = valueOrNull;
    }

    @Override
    public <R> FOptional<R> map(Function<T, R> function) {
        if (valueOrNull == null)
            return empty();
        else
            return of(function.apply(valueOrNull));
    }

    public static <T> FOptional<T> of(T t) {
        return new FOptional<>(t);
    }

    static <T> FOptional<T> empty() {
        return new FOptional<>(null);
    }
}
