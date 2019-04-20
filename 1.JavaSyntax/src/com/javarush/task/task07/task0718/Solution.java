package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        boolean b = false;
        int index = 0;

        for (int i = 0; i < 10; i++) list.add(reader.readLine());

        for (int i = 0; i < 9; i++) {
            if (list.get(i).length() > list.get(i+1).length()) {
                index = i+1;
                b = true;
                break;//напишите тут ваш код
            }
        }
        if (b) System.out.println(index);
    }
}

