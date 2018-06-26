package com.npadhya.practice.streams;

import java.util.ArrayList;
import java.util.List;

public class ParallelStreamExample {

    public static void parallelStreamPrinting(){
        long start = System.nanoTime();
        List<Integer> numbers = new ArrayList<Integer>();

        for(int i = 0 ; i < Integer.MAX_VALUE/100; i++){
            numbers.add(i);
        }

        System.out.println(numbers.stream().parallel().filter(e -> e%2==0).mapToInt(e->e*2).sum());
        long end = System.nanoTime();

        System.out.println((end-start)/10000);
    }
}
