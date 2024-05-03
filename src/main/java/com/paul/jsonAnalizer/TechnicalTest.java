package com.paul.jsonAnalizer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class TechnicalTest {
    public static void main(String[] args) {

        try{
            URL url = new URL("https://636c81c0ad62451f9fcbe894.mockapi.io/api/v1/client");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            InputStream inputStream = connection.getInputStream();

            //ya no me acordaba como usar esto :o
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder response = new StringBuilder();
            String linea = "";

            while((linea = reader.readLine()) != null){
                response.append(linea);
            }
            //primero limpiar el string
            String jsonResponse = "{\"data\": \"key=aadfafad, age=58, key=sdad, age=64, key=jp9zt, age=47\"}";
            String limpiar = jsonResponse.replace("{","").replace("}","").replace("\"data\": ","");


            Map<String, Integer> data =  new HashMap<>();
            String[] elements = response.toString().split(",");

            //recorrer cada elemento que es de tipo [[],[],[]]
            for (String element: elements){
                String[] keyValue = element.trim().split("=");
                if(keyValue.length==2 && "age".equals(keyValue[0])){
                    data.put(keyValue[0].trim(), Integer.parseInt(keyValue[1].trim()));
                }
            }


            System.out.println(response.toString());


        }catch (IOException e){
            e.printStackTrace();
        }


        String jsonResponse = "{\"data\": \"key=aadfafad, age=58, key=sdad, age=64, key=jp9zt, age=47\"}";

        String limpiar = jsonResponse.replace("{","").replace("}","").replace("\"data\": ","");


    }
}
