package com.paul;

import com.paul.CLIArguments.CLIArguments;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class StringFuntions {
    public static void main(String[] args) {
        //unaryOperator is a funtionalInterface that take a parameter and returns
        //the same kind of parameter this is a subclass of Funtion<>
        UnaryOperator<String> quote = text -> "\"" + text + "\"";
        UnaryOperator<String> addMark = text -> text + "!";
        System.out.println(quote.apply("Hola Estudiante de platzi!"));

        System.out.println(addMark.apply("Hola"));

        BiFunction<Integer,Integer,Integer> multiplicacion = (x,y)-> x*y;

        BiFunction<String,Integer,String> leftPad = (text,number) -> String.format("%"+number+"s",text);
        System.out.println(leftPad.apply("Java",10));

        new StringFuntions().consumerHelper.accept(16);
    }

    Consumer<Integer> consumerHelper = cliArguments1 -> {
        if(cliArguments1 > 10){
            System.out.println("numero" + cliArguments1);
        }
    };

}
