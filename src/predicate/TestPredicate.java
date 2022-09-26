package predicate;

import java.util.function.Predicate;

public class TestPredicate {

    public static void main(String[] args) {

        // Evaluate<T> an Interface

        Evaluate<Integer> lambda = i -> i < 0;
        System.out.println(lambda.isNegative(-1));
        System.out.println(lambda.isNegative(1));

        System.out.println();

        // just Regular Predicate<Integer>

        Predicate<Integer> predicate = i -> i > 0;
        System.out.println(predicate.test(-1));
        System.out.println(predicate.test(-1));

        System.out.println();

        // Boolean methode check() with two args, Type Integer and Predicate<Integer>

        int x = 4;
        System.out.println("Is " + x + " even? " + check(x, n -> n % 2 ==0));

        x = 7;
        System.out.println("Is " + x + " even? " + check(x, n -> n % 2 ==0));

        System.out.println();

        String name = "Mr. joe Bloggs";
        System.out.println("Does " + name + " start with Mr. ? " + check(name, n -> n.startsWith("Mr.")));

        name = "Ms. Anne Bloggs";
        System.out.println("Does " + name + " start with Mr. ? " + check(name, n -> n.startsWith("Mr.")));

        System.out.println("\nVatican city ?: ");

        Predicate<String> pStr = n -> n.contains("City");
        System.out.println(pStr.test("Vatican City"));
    }

    public static <T> boolean check(T t, Predicate<T> lambda){
        return lambda.test(t);
    }
}
 interface Evaluate<T>{
    boolean isNegative(T t);
 }
