package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                                new InputStreamReader(System.in));

        String fileIn = reader.readLine();
        String fileOut = reader.readLine();
        reader.close();

        BufferedReader in = new BufferedReader(new FileReader(fileIn));
        BufferedWriter out = new BufferedWriter(new FileWriter(fileOut));

        String text = "";
        while (in.ready()) {
            text += in.readLine();
        }

        text = text.replace('.', '!');

        out.write(text);

        in.close();
        out.close();
    }
}
