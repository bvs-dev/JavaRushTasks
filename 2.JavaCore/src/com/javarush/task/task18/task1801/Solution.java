package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(
                                new InputStreamReader(System.in));

        String fileName = reader.readLine();

        FileInputStream in = new FileInputStream(fileName);

        int b;
        Integer max = null;

        while (in.available() > 0) {
            b = in.read();
            if (max == null) max = b;
            else if (max < b) max = b;
        }
        System.out.println(max);

        reader.close();
        in.close();
    }
}
