package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                                new InputStreamReader(System.in));
        String file1, file2, file3;
        file1 = reader.readLine();
        file2 = reader.readLine();
        file3 = reader.readLine();
        FileOutputStream outputStream = new FileOutputStream(file1, true);
        FileInputStream inputStream2 = new FileInputStream(file2);
        FileInputStream inputStream3 = new FileInputStream(file3);

        int c;
        while ((c = inputStream2.read()) != -1) {
            outputStream.write(c);
        }

        while ((c = inputStream3.read()) != -1) {
            outputStream.write(c);
        }

        reader.close();
        outputStream.close();
        inputStream2.close();
        inputStream3.close();

    }
}
