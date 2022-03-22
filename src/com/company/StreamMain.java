package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        List<Integer> stream = list.stream().filter(x -> x > 0 && x % 2 == 0).sorted().collect(Collectors.toList());
        System.out.println(stream);//   list.stream().filter(x -> x > 0 && x % 2 == 0).sorted().forEach(System.out::println);

    }

}