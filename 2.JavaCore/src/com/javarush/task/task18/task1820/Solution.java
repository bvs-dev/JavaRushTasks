package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();
        FileInputStream q = new FileInputStream(file1);
        FileOutputStream w = new FileOutputStream(file2);

        String output = Files.lines(Paths.get(file1))
                .map(s -> s.split("\\s"))
                .flatMap(Arrays::stream)
                .map(str -> Math.round(Float.parseFloat(str))+" ")
                .collect(Collectors.joining());
        FileWriter out = new FileWriter(file2);
        out.write(output);
        out.close();

        q.close();
        w.close();

    }
}
