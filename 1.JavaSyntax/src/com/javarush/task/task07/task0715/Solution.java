package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list =  new ArrayList<>();

        Collections.addAll(list, "мама", "мыла", "раму");

        list.add(1, "именно");
        list.add(3,"именно");
        list.add(5,"именно");

        list.forEach(System.out::println);//напишите тут ваш код
    }
}
