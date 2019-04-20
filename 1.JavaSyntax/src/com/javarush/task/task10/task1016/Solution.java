package com.javarush.task.task10.task1016;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Одинаковые слова в списке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> words = new ArrayList<String>();
        for (int i = 0; i < 20; i++) { //return 20
            words.add(reader.readLine());
        }

        Map<String, Integer> map = countWords(words);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> list) {
        HashMap<String, Integer> result = new HashMap<String, Integer>();
        ArrayList<String> words = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (!words.contains(list.get(i))) words.add(list.get(i));
        }

        for (int i = 0; i < words.size(); i++) {
            int num = 0;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j).equals(words.get(i))) {
                    num++;
                }
            }
            result.put(words.get(i), num);
        }
        return result;


    }

}

