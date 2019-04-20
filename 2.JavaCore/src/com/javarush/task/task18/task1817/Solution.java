package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.text.DecimalFormat;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(args[0]);
        int count = 0;
        int spaceCount = 0;

        int c;
        while ((c = inputStream.read()) != -1) {
            if (c == 32) spaceCount++;
            count++;
        }
        inputStream.close();

        DecimalFormat newFormat = new DecimalFormat("#.##");
        double result = spaceCount * 100/(double) count;
        result = Double.valueOf(newFormat.format(result));
        System.out.println(result);

    }
}
