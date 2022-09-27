package methodReferance;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class SupplierBinaryMerthodReferance {

    public static void main(String[] args) {

        boundMethodReference();
    }

    static void boundMethodReference(){

        // Supplier<T>
        // T get()

        String name = "Mr. Joe Bloggs";
        Supplier<String> lowerL = () -> name.toLowerCase();
        Supplier<String> lowerMR = name::toLowerCase;

        System.out.println(lowerL.get()); // mr. joe bloggs
        System.out.println(lowerMR.get()); // mr. joe bloggs


        System.out.println();

        // Predicate<T>
        // boolean test(t t);

        Predicate<String> titleL = (title) -> name.startsWith(title);
        Predicate<String> titleMR = name::startsWith;

        System.out.println(titleL.test("Mr.")); // true
        System.out.println(titleMR.test("Ms.")); // false


    }
}
