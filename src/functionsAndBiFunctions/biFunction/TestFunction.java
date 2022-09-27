package functionsAndBiFunctions.biFunction;

import java.util.function.BiFunction;
import java.util.function.Function;

public class TestFunction {

    public static void main(String[] args) {

        function();
    }

    static void function(){

        // Function<T, R> is a functional interface i.e. abstract method:
        // R apply(T t);

        // BiFunction<T, U, R> is a functional intrface i.e. one abstract method:
        // R apply(T t, U u)

        Function<String, Integer> fn2 = String::length;
//        Function<String, Integer> fn2 = n -> n.length();
        System.out.println(fn2.apply("Moscove"));

        System.out.println("\n// BiFunctional\n");

        BiFunction<String, String, Integer> biFn = (t1, t2) -> t1.length() + t2.length();
        System.out.println(biFn.apply("Mietek", "Franek"));

        System.out.println();

        BiFunction<String, String, String> biFn2 = (t1, t2) -> t1.concat(t2);
        System.out.println("Dodaj dwa " + biFn2.apply("William ", "shakespare"));
    }
}
