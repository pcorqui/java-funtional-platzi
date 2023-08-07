package com.paul.streams;

import java.util.stream.Stream;

//optional is a class for avoid the null problem
public class OptionalClass {
    public static void main(String[] args) {
        Stream<String> list = Stream.of("1","2","3","4","5");
        String result = list
                .filter(e-> "42".equals(e))
                .findAny()
                .orElse(("Not Found"));

        System.out.println(result);
    }
}
