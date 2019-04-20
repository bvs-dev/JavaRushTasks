package com.javarush.task.task19.task1918;

/* 
Знакомство с тегами
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                                new InputStreamReader(System.in));

        String fileName = reader.readLine();

        reader.close();

        String str = "";

        BufferedReader in = new BufferedReader(new FileReader(fileName));
        while (in.ready()) {
            str += in.readLine();
        }

        Pattern pt = Pattern.compile(String.format("<%s"));
    }


}
