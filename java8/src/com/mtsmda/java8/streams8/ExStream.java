package com.mtsmda.java8.streams8;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * Created by MTSMDA on 30.11.2015.
 */
public class ExStream {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(19);
        integerList.add(98);
        integerList.add(192);
        integerList.add(201);
        integerList.add(1);
        integerList.add(193);
        integerList.add(9524);

        System.out.println(integerList);

        //min
        Stream<Integer> integerStream = integerList.stream();
        Optional<Integer> integerOptional = integerStream.min(Integer::compare);
        if(integerOptional.isPresent()){
            System.out.println(integerOptional.get());
        }

        //max
        Stream<Integer> integerStreamMax = integerList.stream();
        Optional<Integer> integerOptionalMax = integerStreamMax.max(Integer::compare);
        if(integerOptionalMax.isPresent()){
            System.out.println(integerOptionalMax.get());
        }

        //sorted
        Stream<Integer> integerStreamSorted = integerList.stream().sorted();
        System.out.println("Sorted - ");
        integerStreamSorted.forEach((n) -> {
            System.out.print(n + ", ");
        });

        //filter
        System.out.println("\nfilter");
        Stream<Integer> integerStreamNeCetnye = integerList.stream().filter((n) -> (n % 2) == 1);
        integerStreamNeCetnye.forEach((n) -> System.out.println(n));

        System.out.println("second filter");
        Stream<Integer> integerStreamFilterSecond = integerList.stream().filter((n) -> (n > 100 && n < 200)).filter((n) -> (n % 2) == 0);
        integerStreamFilterSecond.forEach((n) -> System.out.println(n));


        //reduce
        Optional<Integer> integerOptionalReduce = integerList.stream().reduce((a, b) -> a + b);
        if(integerOptionalReduce.isPresent()){
            System.out.println(integerOptionalReduce.get());
        }

        Integer integerOptionalReduce1 = integerList.stream().reduce(0, (a, b) -> a + b);
        System.out.println(integerOptionalReduce1);

        //parallel
        Double result = integerList.parallelStream().reduce(1.0, (a, b) -> a * b, (c, d) -> c + d);
        System.out.println(result);

        /*Thread thread = new Thread(() -> {
            try {
                for(int i = 0; i < 5; i++){
                    System.out.println(LocalTime.now());
                    Thread.sleep(2500);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread.start();*/

        Stream<Integer> integerStreamMap = integerList.stream().map((n) -> n + n);
        int sum = integerStreamMap.reduce(0, (n, c) -> n + c);
        System.out.println("sum = " + sum);

    }

}