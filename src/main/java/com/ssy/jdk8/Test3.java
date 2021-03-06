package com.ssy.jdk8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Test3 {

    public static void main(String[] args) {
//        TheInterface theInterface = () -> {};
//        System.out.println(theInterface.getClass().getInterfaces()[0]);
//
//        TheInterface2 theInterface2 = () -> {};
//        System.out.println(theInterface2.getClass().getInterfaces()[0]);
//
//        new Thread(() -> {
//            System.out.println("hello world");
//        }).start();

        List<String> list = Arrays.asList("hello", "world", "hello world");
//        list.forEach(item -> System.out.println(item.toUpperCase()));

//        List<String> list1 = new ArrayList<>();
//        list.forEach(item -> list1.add(item.toUpperCase()));
//        list1.forEach(item -> System.out.println(item));

        // 串行流，单线程完成
        // 并行流，多线程完成
        // 中间流，返回流，可以继续流操作
        // 节点流，返回最终结果
        // 流必须要有一个源，就是流要操作的目标数据
//        list.stream().map(item -> item.toUpperCase()).forEach(item -> System.out.println(item));
//        list.stream().map(String::toUpperCase).forEach(System.out::println);

        Function<String, String> function = String::toUpperCase;
        System.out.println(function.getClass().getInterfaces()[0]);
    }

}

@FunctionalInterface
interface TheInterface {

    void myMethod();
}

@FunctionalInterface
interface TheInterface2 {

    void myMethod2();
}
