package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        String inFile = reader.readLine();
        String outFile = reader.readLine();
        reader.close();

        FileReader in = new FileReader(inFile);
        FileWriter out = new FileWriter(outFile);

        int i = 1;
        while (in.ready()) {
            int s = in.read();
            if (i % 2 == 0) out.write(s);
            i++;
        }
        in.close();
        out.close();
    }
}
