package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<>();
        String s = "A";
        int num = 0;
        for (int i = 0; i < 10; i++) {
            map.put(s, num);
            s += "A";
            num += 100;
        }
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        Iterator<Map.Entry<String, Integer>> itr = map.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry<String, Integer> pair = itr.next();
            if (pair.getValue() < 500) itr.remove();//напишите тут ваш код
        }
    }

    public static void main(String[] args) {

    }
}