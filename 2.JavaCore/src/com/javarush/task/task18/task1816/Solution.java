package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(args[0]);

        int count = 0;
        int c;
        while ((c = inputStream.read()) != -1) {
            if (((c >= 65) && (c <= 90)) || ((c >= 97) && (c <= 122))) count++;
        }

        System.out.println(count);
        inputStream.close();
    }
}
