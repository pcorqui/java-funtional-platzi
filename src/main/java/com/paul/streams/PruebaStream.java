package com.paul.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class PruebaStream {

    public static void main(String[] args) {
        List<Persona> people = new ArrayList<>();

        people.add(new Persona("Alfred",17));
        people.add(new Persona("Henry",18));
        people.add(new Persona("George",19));
        people.add(new Persona("Joe",27));
        people.add(new Persona("Zelda",7));

        for(Persona currentPerson: people){
            System.out.print(currentPerson.getName());
            System.out.print(" - ");
            System.out.println(currentPerson.getAge());
        }

        System.out.println("==============");

        people.stream().forEach(currentPerson -> {
            System.out.print(currentPerson.getName());
            System.out.print(" - ");
            System.out.println(currentPerson.getAge());
        });

        System.out.println("======== ");
        //using filter() with a stream
        System.out.println("Age 18 or greater == ");
        people.stream()
                .filter(currentPerson -> currentPerson.getAge()>=18)
                .forEach(currentPerson -> {
                    System.out.print(currentPerson.getName());
                    System.out.print(" - ");
                    System.out.println(currentPerson.getAge());
                });
        System.out.println("======== ");
        System.out.println("start with G");
        people.stream()
                .filter(currentPerson -> currentPerson.getName().startsWith("G"))
                .forEach(currentPerson -> {
                    System.out.print(currentPerson.getName());
                    System.out.print(" - ");
                    System.out.println(currentPerson.getAge());
                });

        //Stream<Persona> otherPerople = people.stream();

        System.out.println("map de enteros");
        //la metodo map retorna un string del tipo R de una funcion dada
        people.stream().map(persona -> persona.getAge()).forEach(x->System.out.println(x));



    }
}
