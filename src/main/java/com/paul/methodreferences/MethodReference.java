package com.paul.methodreferences;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MethodReference {
    public static void main(String[] args) {
        //you can declare a funcion in one line
        Supplier<Integer> input = () -> 3;
        Predicate<Integer> checkValue = d -> d < 5;
        Function<Integer,Double> calculate = i -> i * 5.0;
        Consumer<Double> printResult = d -> System.out.println(
                "Result: " + d
        );

        if(checkValue.test(input.get())){
            printResult.accept(calculate.apply(input.get()));
        }else {
            System.out.println("Input " + input.get() + "is too small.");
        }

        //if the function consist of two or more lines, we could implement them as follows
        Supplier<Integer> largeInput= () -> {
            // as many line of code here as necessary
            return 3;
        };

        Predicate<Integer> largeCheckValue = (d) -> {
                //as many line of code here as necessary
                return d > 5;
        };

        Function<Integer,Double> largeCalculate = (a) -> {
            //as many line of code here as necessary
            return a * 5.0;
        };

        Consumer<Integer> largePrintResult = (a)-> {
            System.out.println("**");
            System.out.println("***");
            System.out.println("****");
            System.out.println("*****");
            System.out.println("******");
            System.out.println("Input " + a + "is too small");
        };

        if(largeCheckValue.test(input.get())){
            printResult.accept(largeCalculate.apply(input.get()));
        }else {
            System.out.println("Input " + largeInput.get() + "is too small.");
        }
    }
}
