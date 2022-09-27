package functionsAndBiFunctions.unaryBinaryOperator;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class TestUnaryBinary {

    public static void main(String[] args) {

        unaryBinaryOperator();
    }

    static void unaryBinaryOperator(){

        // UnaryOperator and binary operator must much with parametr passed in declaration
        // UnaryOperator<T> extends Function<T, T>is a functional interface i.e. one abstract method:
        // T apply(T t)

        UnaryOperator<String> unaryOp = name -> "My name is " + name;
        System.out.println("UnaryOperator: " + unaryOp.apply("Franek"));

        // BinaryOperator<T> extends BiFunction<T, T, T> is a functional interface i.e. one abstract metod:
        // T apply(T t, U u);

        BinaryOperator<String> binaryOp = (s1, s2) -> s1.concat(s2);
        System.out.println("BinaryOparator: " + binaryOp.apply("Franek ", "Kimono"));


    }
}
