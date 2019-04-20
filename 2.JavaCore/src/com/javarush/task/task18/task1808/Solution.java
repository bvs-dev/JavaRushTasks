package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(
                                new InputStreamReader(System.in));


        FileInputStream inputStream = new FileInputStream(reader.readLine());
        FileOutputStream outputStream1 = new FileOutputStream(reader.readLine());
        FileOutputStream outputStream2 = new FileOutputStream(reader.readLine());


        while (inputStream.available() > 0) {
            byte[] buffer = inputStream.available()%2 == 0 ? new byte[inputStream.available() / 2] : new byte[inputStream.available() / 2 + 1];
            int count = inputStream.read(buffer);
            outputStream1.write(buffer, 0, count);
            count = inputStream.read(buffer);
            outputStream2.write(buffer, 0, count);
        }

        reader.close();
        inputStream.close();
        outputStream1.close();
        outputStream2.close();
    }
}
