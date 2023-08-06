package com.paul.consumer;

import java.util.function.Consumer;

public class DemoConsumer {

    public static void main(String[] args) {
        String externalData = "External data";

        //se declara una funcion terminal
        Consumer<Persona> setRecord = persona -> {
                persona.setRecord(persona.getFirstName() + " " +
                persona.getLastName() + ", " + persona.getAge() + ", " + externalData);
        System.out.println("primera persona: " + persona);};

        //otra funcion terminal
        Consumer<Persona> printRecord = persona -> System.out.println("esta es la persona: " + persona);

        //then regresa un Consumer con el tipo dado
        //una funcion que ejecutara primero el accept de setRecord y luego el de printRecord
        Consumer<Persona> setRecordThenPrint = setRecord.andThen(printRecord);
        setRecordThenPrint.accept(new Persona(42,"paul","cortes"));

    }

}
