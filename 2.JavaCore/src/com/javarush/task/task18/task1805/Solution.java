package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(
                                new InputStreamReader(System.in));

        String fileName = reader.readLine();
        ArrayList<Integer> list = new ArrayList<>();

        FileInputStream inStream = new FileInputStream(fileName);
        while (inStream.available() > 0) {
            int b = inStream.read();
            if (!list.contains(b)) list.add(b);
        }

        Collections.sort(list);
        list.forEach(s -> System.out.print(s + " "));
        reader.close();
        inStream.close();
    }
}
