package com.paul.methodreferences;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * when the size of a function implementation grows beyond several lines of code, such a code layout may not be easy to read.
 * It may obscure the overall code structure. To avoid this issue, it is possible to move the function implementation into a
 * method and then refer to this method in the Lambda expression
 */
public class Helper {
    public double calculate(int i){
        //maybe many lines of code here
        return i*5;
    }

    public static void printResult(double d){
        //maybe many lines of code here
        System.out.println("Result: " + d);
    }

    private int generateInput(){
        //maybe many lines of code here
        return 3;
    }

    private static boolean checkValue(double d){
        //maybe many lines of code here
        return d<5;
    }

    public static void main(String[] args) {
        Supplier<Integer> input = () -> new Helper().generateInput();
        Predicate<Integer> checkValue = d -> checkValue(d);
        Function<Integer, Double> calcula = i -> new Helper().calculate(i);
        Consumer<Double> printResult = d -> Helper.printResult(d);

        if(checkValue.test(input.get())){
            printResult.accept(calcula.apply(input.get()));
        }else{
            System.out.println("Input " + input.get() + " is too small.");
        }

        new Helper().methodReferenceDemo();
    }

    /*
        When a one-line Lambda expression consists of a reference to an existing method, it is possible to further simplify the notation by using a method a reference without listing the parameters.
        The syntax of the method reference is Location:: methodName where Location indicates in which object or class the methodName method belongs
         */
    public void methodReferenceDemo(){

        Supplier<Integer> rInput = this::generateInput;
        Predicate<Integer> rCheckValue = Helper::checkValue;
        Function<Integer,Double> rcalculate = new Helper()::calculate;
        Consumer<Double> printResult = Helper::printResult;

        if(rCheckValue.test(rInput.get())){
            printResult.accept(rcalculate.apply(rInput.get()));
        }else {
            System.out.println("Input " + rInput.get() + " is too small.");
        }
    }
}
