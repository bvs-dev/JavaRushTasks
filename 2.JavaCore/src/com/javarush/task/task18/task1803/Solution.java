package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(
                                new InputStreamReader(System.in));

        String fileName = reader.readLine();
        FileInputStream inStream = new FileInputStream(fileName);

        HashMap<Integer, Integer> map = new HashMap<>();

        while (inStream.available() > 0) {
            Integer key = inStream.read();

            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        Integer maxVal = null;
        for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
            if (maxVal == null) maxVal = pair.getValue();
            else if (maxVal < pair.getValue()) maxVal = pair.getValue();
        }

        for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
            if (maxVal.equals(pair.getValue())) System.out.print(pair.getKey() + " ");
        }

        reader.close();
        inStream.close();

    }
}
