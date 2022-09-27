package methodReferance;

import java.util.SimpleTimeZone;
import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionBiFunction {

    public static void main(String[] args) {

        unboundMethodReference();
    }

    static void unboundMethodReference(){

        // Function<T, R>
        // R apply(T)

        Function<String, String> upperL = s -> s.toUpperCase();
        Function<String, String> upperMR = String::toUpperCase;

        System.out.println(upperL.apply("sean"));
        System.out.println(upperMR.apply("sean"));

        System.out.println();

        // BiFunction<T, U, R>
        // R apply(T t, U u)
        BiFunction<String, String, String> concataL = (s1, s2) -> s1.concat(s2);
        BiFunction<String, String, String> concataMR = String::concat;

        System.out.println(concataL.apply("Sean ", "Kennedy"));
        System.out.println(concataMR.apply("Sean ", "Kennedy"));
    }
}
