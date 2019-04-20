package com.javarush.task.task18.task1823;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        String c;
        BufferedReader reader = new BufferedReader(
                                new InputStreamReader(System.in));

        ArrayList<String> names = new ArrayList<>();

        while (!(c = reader.readLine()).equals("exit")) {
            names.add(c);
        }
        reader.close();
        for (String name : names) {
            new ReadThread(name).start();
        }
    }


    public static class ReadThread extends Thread {
        private String fileName;
        public ReadThread(String fileName) {
            this.fileName = fileName;//implement constructor body
        }


        public void run () {
            Map<Integer, Integer> bytes = new TreeMap<>();
            try (FileInputStream in = new FileInputStream(fileName)){

                while (in.available() > 0) {
                    int b = in.read();
                    bytes.put(b, bytes.getOrDefault(b, 0) + 1);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            int value = 0;
            int key = 0;

            for (Map.Entry<Integer, Integer> pair : bytes.entrySet()) {
                if (value < pair.getValue()) {
                    value = pair.getValue();
                    key = pair.getKey();
                }
            }

            Solution.resultMap.put(fileName, key);
        }



    }
}
