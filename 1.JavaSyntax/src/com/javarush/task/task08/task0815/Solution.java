package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();//напишите тут ваш код
        map.put("ad", "asd");
        map.put("das", "sdd");
        map.put("asd", "dasd");
        map.put("asdsd", "asdasd");
        map.put("asddasd", "asdasd");
        map.put("asdafsd", "asd");
        map.put("asxdad", "asd");
        map.put("asdasd", "asdasd");
        map.put("asdad", "asdad");
        map.put("asdads", "asdad");

        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int numb = 0;
        for (Map.Entry <String, String> pair : map.entrySet()) {
            if (pair.getValue().equals(name)) numb++;//напишите тут ваш код
        }
        return numb;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int numb = 0;
        for (Map.Entry <String, String> pair : map.entrySet()) {
            if (pair.getKey().equals(lastName)) numb++;//напишите тут ваш код
        }
        return numb;//напишите тут ваш код
    }

    public static void main(String[] args) {
//        System.out.println( getCountTheSameFirstName(createMap(), "asd"));
//        System.out.println( getCountTheSameLastName(createMap(), "asd"));
    }
}
