package com.ssy.jdk8;

import java.util.function.Function;

public class FunctionTest {

    public static void main(String[] args) {
        FunctionTest test = new FunctionTest();
//        System.out.println(test.compute(1, value -> 2 * value));
//        System.out.println(test.compute(2, value -> value + 5));
//        System.out.println(test.compute(3, value -> value * value));
//        System.out.println(test.compute(4, new Function<Integer, Integer>() {
//            @Override
//            public Integer apply(Integer integer) {
//                return integer / 2;
//            }
//        }));
//
//        System.out.println(test.convert(5, value -> String.valueOf(value + " hello world")));

        Function<Integer, Integer> function = value -> value * 2;
        System.out.println(test.compute(6, function));

    }

    public int compute(int a, Function<Integer, Integer> function) {
        return function.apply(a);
    }

    public String convert(int a, Function<Integer, String> function) {
        return function.apply(a);
    }

    public int method1(int a) {
        return 2 * a;
    }

    public int method2(int a) {
        return 5 + a;
    }

    public int method3(int a) {
        return a * a;
    }
}
