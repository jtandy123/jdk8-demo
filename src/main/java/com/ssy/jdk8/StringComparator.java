package com.ssy.jdk8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringComparator {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("zhangsan", "lisi", "wangwu", "zhaoliu");

//        Collections.sort(names, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.compareTo(o1);
//            }
//        });

//        Collections.sort(names, (String o1, String o2) -> {
//            return o2.compareTo(o1);
//        });

//        Collections.sort(names, Comparator.reverseOrder());

        names.sort(Comparator.reverseOrder());

        System.out.println(names);
    }
}
