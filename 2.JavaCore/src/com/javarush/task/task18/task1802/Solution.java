package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        String fileName = reader.readLine();

        FileInputStream in = new FileInputStream(fileName);

        int b;
        Integer min = null;

        while (in.available() > 0) {
            b = in.read();
            if (min == null) min = b;
            else if (min > b) min = b;
        }
        System.out.println(min);

        reader.close();
        in.close();
    }
}
