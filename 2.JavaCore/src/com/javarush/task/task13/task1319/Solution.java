package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.ArrayList;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String c;
        String fileName = reader.readLine();
        BufferedWriter printer = new BufferedWriter (new FileWriter(fileName));


        do {
            c = reader.readLine();
            printer.write(c + "\r\n");
        } while (!c.equals("exit"));




        printer.close();
        reader.close();
    }
}
