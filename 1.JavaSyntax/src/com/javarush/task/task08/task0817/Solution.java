package com.javarush.task.task08.task0817;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("a", "asd");//напишите тут ваш код
        map.put("as", "asd");//напишите тут ваш код
        map.put("asd", "asdasd");//напишите тут ваш код
        map.put("asdd", "asdasdasd");//напишите тут ваш код
        map.put("assdd", "asdasdasdad");//напишите тут ваш код
        map.put("asdddd", "d");//напишите тут ваш код
        map.put("asddddd", "asda");//напишите тут ваш код
        map.put("asdasdad", "d");//напишите тут ваш код
        map.put("asdasdasd", "asdd");//напишите тут ваш код
        map.put("asdasdasdasd", "f");//напишите тут ваш код

        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        ArrayList<String> list = new ArrayList<>();
        for (Map.Entry<String, String> pair : map.entrySet()) {
            int num = 0;
            for (Map.Entry<String, String> pai : map.entrySet()) {
                if (pair.getValue().equals(pai.getValue())) num++;
                if ((num > 1) && (!list.contains(pair.getValue()))) list.add(pair.getValue());//напишите тут ваш код
            }
        }
        for (String value : list) removeItemFromMapByValue(map, value);

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
