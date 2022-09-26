package supplier;

import java.time.LocalTime;
import java.time.chrono.ChronoLocalDateTime;
import java.util.Locale;
import java.util.function.Supplier;

public class TestSupplier {

    // Takes no arguments and return the type

    public static void main(String[] args) {

        Supplier<StringBuilder> supSB = () -> new StringBuilder();
        System.out.println("Supplier SB: " + supSB.get().append("SK"));

        Supplier<LocalTime> supTime = () -> LocalTime.now();
        System.out.println("Supplier time: " + supTime.get());

        Supplier<Double> sRandom = () -> Math.random();
        System.out.println("Supplier random: " + sRandom.get());

    }

}
