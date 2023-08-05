package com.paul.functional;

import java.util.function.Function;

public class FuncionesAsParameter {
    public static void main(String[] args) {



        recivedAFunction(x-> x + 3, 2_5);

    }

    public static void recivedAFunction(Function<Integer,Integer> funcion, int numero){

        System.out.println("resultado" + funcion.apply(numero));
    }
}
