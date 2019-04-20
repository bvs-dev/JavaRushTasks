package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                                new InputStreamReader(System.in));

        String fileIn = reader.readLine();
        String fileOut = reader.readLine();

        BufferedReader in = new BufferedReader(new FileReader(fileIn));
        BufferedWriter out = new BufferedWriter(new FileWriter(fileOut));

        /*FileReader in = new FileReader(fileIn);
        FileWriter out = new FileWriter(fileOut);*/

        /*while (in.ready()) {
            int c = in.read();
            fileText += (char) c;
        }*/

        String fileText = in.readLine();
        Pattern p = Pattern.compile("[0-9]+");


        String [] result = fileText.split(" ");
        for (String decimal : result) {
            Matcher m = p.matcher(decimal);
            if (m.matches()) out.write(decimal + " ");
        }
        reader.close();
        in.close();
        out.close();

    }
}
