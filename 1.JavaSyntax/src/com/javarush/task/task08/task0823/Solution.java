package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        char[] str = s.toCharArray();

        if (str[0] != ' ') System.out.print(Character.toUpperCase(str[0]));

        for (int i = 1; i < str.length; i++) {
            if ((str[i] != ' ') && (str[i-1] == ' ')) {
                System.out.print(" " + Character.toUpperCase(str[i]));
            } else System.out.print(str[i]);
        }

    }
}
