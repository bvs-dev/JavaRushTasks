package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                                new InputStreamReader(System.in));

        String file1 = reader.readLine();
        String file2 = reader.readLine();
        FileInputStream inputStream1 = new FileInputStream(file1);
        FileInputStream inputStream2 = new FileInputStream(file2);

        byte buffer[] = new byte[inputStream1.available() + inputStream2.available()];

        while (inputStream1.available() > 0) {
            inputStream1.read(buffer, inputStream2.available(), inputStream1.available());
        }

        while (inputStream2.available() > 0) {
            inputStream2.read(buffer, 0, inputStream2.available());
        }

        inputStream1.close();
        inputStream2.close();

        FileOutputStream outputStream = new FileOutputStream(file1);

        outputStream.write(buffer, 0, buffer.length);
        outputStream.close();
    }
}
