package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < 20; i++) hs.add(i);// напишите тут ваш код
        return hs;
    }

    public static HashSet<Integer> removeAllNumbersGreaterThan10(HashSet<Integer> set) {
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            Integer v = iterator.next();
            if (v > 10) iterator.remove();
        };
        return set;// напишите тут ваш код

    }

    public static void main(String[] args) {

    }
}
