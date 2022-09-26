package biPredicate;

import java.util.function.BiPredicate;

public class biPredicate {

    public static void main(String[] args) {

        System.out.println("Check length of string");

        BiPredicate<String, Integer> checkLength = (str, len) ->  str.length() == len;
        System.out.println(checkLength.test("Vatican City ", 8));
    }
}
