package com.paul.functional;

import java.util.function.Function;
import java.util.function.Predicate;

public class MathFunctions {
    public static void main(String[] args) {
        System.out.println("hola platzi");

        //interfaz funcional: son aquellas que solo tienen un metodo abstracto
        //declaracion de tipo clase anonima
        Function<Integer, Integer> square = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer x) {
                return x * x;
            }
        };

        //cuando igualas un variable funcional a un lamda estas definiendo la funcionalidade de su metodo
        // este caso apply
        //declaracion funcional
        Function<Integer,Integer> squareFuntional = x->x*x;

        //para llamar una interfaz funcional basta con la variable y llamar el metodo apply
        System.out.println(square.apply(5));
        System.out.println(square.apply(25));
        //en este punto una funcion no es diferente de un metodo statico. con la diferencia de que ahora puede pasarse
        //o retornarse.

        //Predicate interfaz funcional que recibe un tipo de dato y retorna un booleano
        Predicate<Integer> isOdd = x -> x < 5;
        System.out.println(isOdd.test(6));
        System.out.println(isOdd.test(3));

        //con un Predicate se pueden hacer validaciones rapidas
        Predicate<Student> aprovo = student -> student.getCalificacion()> 6.0;


        System.out.println("aprovo: " +aprovo.test(new Student(8)));
    }


    static class Student{
        private double calificacion;

        public Student(double calificacion){
            this.calificacion = calificacion;
        }

        public double getCalificacion(){
            return calificacion;
        }
    }
}
