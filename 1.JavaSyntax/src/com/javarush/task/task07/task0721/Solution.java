package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] list = new int[20];

        int maximum;
        int minimum;

        for (int i = 0; i < 20; i++) list[i] = Integer.parseInt(reader.readLine());
        maximum = list[0];
        minimum = list[0];

        for (int i = 1; i < 20; i++)
            if (maximum < list[i]) maximum = list[i];
            else if (minimum > list[i]) minimum = list[i];//напишите тут ваш код

        System.out.print(maximum + " " + minimum);
    }
}
