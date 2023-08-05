package com.paul.functional;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main (String[] args){
        List<Integer> marks = Arrays.asList(15,85,45,62);
        //marks.forEach();
        long count = marks.stream().filter(x-> x>60).count();

        System.out.println(count);
    }
}
