package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        strings = new ArrayList<>();

        BufferedReader reader = new
                BufferedReader( new InputStreamReader(System.in));

        for (int i =0; i < 5; i++) strings.add(reader.readLine());

        int l = strings.get(0).length();
        for (int i =1; i < 5; i++) {
            if (strings.get(i).length() > l)  l = strings.get(i).length();
        }

        for (int i = 0; i < 5; i++)
            if (strings.get(i).length() == l) System.out.println(strings.get(i));//напишите тут ваш код
    }
}
