package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream(args[0]);

        Map<Integer, Integer> symbols = new TreeMap<>();

        while (in.available() > 0) {
            int s = in.read();
            symbols.put(s, symbols.getOrDefault(s, 0) + 1);
        }

        in.close();

        for (Map.Entry<Integer, Integer> pair : symbols.entrySet()) {
            System.out.println((char) (int) pair.getKey() + " " + pair.getValue());
        }



    }
}
