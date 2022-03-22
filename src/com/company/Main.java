package com.company;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.Collections.*;


//Отфильтруйте положительные числа.
//        Отсортируйте отфильтрованные числа в порядке возрастания.
//        Найдите среди этих положительных чисел четные.
public class Main {

    public static void main(String[] args) {

        int[] array = {1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4};
        // List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
        //List<Integer> list1 = IntStream.of(array).boxed().collect(Collectors.toList());
      //  List<Integer> list = ArrayList<> :: new;

        List<Integer> list = new ArrayList();

        for (int i = 0; i < array.length; i++) {

            if (array[i] > 0 && array[i] % 2 == 0) {
                list.add(array[i]);
            }
        }
sort(list, (a,b)->a.compareTo(b));
        System.out.println(list);
    }
}