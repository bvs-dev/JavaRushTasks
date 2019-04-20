package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] house = new int[15];
        int even = 0, odd = 0;

        for (int i = 0; i < 15; i++) house[i] = Integer.parseInt(reader.readLine());

        for (int i = 0; i < 15; i++) {
            if ((i % 2 == 0) || (i == 0)) even += house[i];
            else odd += house[i];
        }
        if (even > odd) System.out.println("В домах с четными номерами проживает больше жителей.");
        if (odd > even) System.out.println("В домах с нечетными номерами проживает больше жителей.");//напишите тут ваш код
    }
}
