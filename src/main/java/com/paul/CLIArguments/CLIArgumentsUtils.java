package com.paul.CLIArguments;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class CLIArgumentsUtils {
    static void showHelp(CLIArguments cliArguments){
        //un consumer puede ser usado para aplicar ulguna operacion sobre un tipo de dato
        //podemos tener un listado de datos y por cada dato en esa lista vamos consumiendo y operando sobre ese dato
        Consumer<CLIArguments> consumerHelper = cliArguments1 -> {
            if(cliArguments1.isHelp()){
                System.out.println("Manual solicitado");
            }
        };

        //se invoca
        consumerHelper.accept(cliArguments);
    }

    //Supplier es una interfaz generica
    //un suplier es una funcion lo que hace es generar datos
    static CLIArguments generateCLI(){
        //primero se define el lamda la funcion lo que hara
        Supplier<CLIArguments> generator =  () -> new CLIArguments();

        //despues se invoca este retornara un objeto CLIArguments
        return generator.get();
    }
}
