package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        InputStream inStream = new FileInputStream(fileName);
        int c;
        while ((c =inStream.read()) != -1) {
            System.out.print((char)c);// напишите тут ваш код
        }
        inStream.close();
        reader.close();
    }
}