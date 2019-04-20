package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList <String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) list.add(reader.readLine());
        int bigind = 0;
        int smallind = 0;

        for (int i = 1; i < 10; i++) {
            if (list.get(i).length() > list.get(bigind).length()) bigind = i;
            if (list.get(i).length() < list.get(smallind).length()) smallind = i;//напишите тут ваш код
        }
        if (bigind < smallind) System.out.println(list.get(bigind));
        if (smallind < bigind) System.out.println(list.get(smallind));
    }
}
