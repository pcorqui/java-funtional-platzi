package com.paul.CLIArguments;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class CLIArgumentsUtils {
    static void showHelp(CLIArguments cliArguments){
        //un consumer puede ser usado para aplicar ulguna operacion sobre un tipo de dato
        Consumer<CLIArguments> consumerHelper = cliArguments1 -> {
            if(cliArguments1.isHelp()){
                System.out.println("Manual solicitado");
            }
        };

        //se invoca
        consumerHelper.accept(cliArguments);
    }

    //un suplier lo que hace es generar datos
    static CLIArguments generateCLI(){
        //primero se define el lamda la funcion lo que hara
        Supplier<CLIArguments> generator =  () -> new CLIArguments();

        //despues se invoca
        return generator.get();
    }
}
