package functionsAndBiFunctions.consumerBiConsumer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class TestConsumer {

    // BiConsumer<T, U> is a functional interface abstrakt method;
    // return void accept(T t, U u);

    public static void main(String[] args) {

        printConsumer();
    }

    static void printConsumer() {
        Consumer<String> printC = System.out::println;
//        Consumer<String> printC = n -> System.out.println(n);
        printC.accept("Wypisz to na ekran");

        System.out.println("\nDrukuj liste\n");

        List<String> names = new ArrayList<>();
        names.add("Krzysiek");
        names.add("Adam");
        names.forEach(System.out::println);

        // BiConsumer<T, U> is a functional interface i.e. one abstract method:
        // void accept(T t, U u);

        var mapCapitalCities = new HashMap<String, String>();

        BiConsumer<String, String> biCon = (key, value) -> mapCapitalCities.put(key, value);
        biCon.accept("Dublin", "Ireland");
        biCon.accept("Washington", "USA");
        System.out.println(mapCapitalCities);

        System.out.println("\n// Hash map print Town and Country with description\n");

        BiConsumer<String, String> printMap = (key, value) -> System.out.println(key + " is a capital of " + value);

        mapCapitalCities.forEach(printMap);

    }
}
