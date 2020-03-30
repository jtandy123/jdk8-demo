package com.ssy.jdk8;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Test1 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

//        for (int i = 0; i < list.size(); ++i) {
//            System.out.println(list.get(i));
//        }

//        System.out.println("------");
//
//        for (Integer i : list) {
//            System.out.println(i);
//        }

//        System.out.println("------");

//        for (Iterator<Integer> iter = list.iterator(); iter.hasNext();) {
//            System.out.println(iter.next());
//        }
//
//        System.out.println("------");

//        list.forEach((Integer i) -> {
//            System.out.println(i);
//        });
//
//        System.out.println("------");

        // method reference
        list.forEach(System.out::println);

//        System.out.println("------");
//
//        Consumer<Integer> consumer = (Integer integer) -> {
//            System.out.println(integer);
//        };
//        Consumer<Integer> consumer1 = consumer.andThen((Integer integer) -> {
//            System.out.println("after: " + integer);
//        });

//        list.forEach(consumer1);
    }
}
