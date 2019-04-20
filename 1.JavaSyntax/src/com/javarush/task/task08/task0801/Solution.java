package com.javarush.task.task08.task0801;

/* 
HashSet из растений
*/

import java.util.HashSet;
import java.util.Iterator;

public class Solution {
    public static void main(String[] args) throws Exception {
        HashSet<String> HashSet = new HashSet<>();
        HashSet.add("арбуз");
        HashSet.add("банан");
        HashSet.add("вишня");
        HashSet.add("груша");
        HashSet.add("дыня");
        HashSet.add("ежевика");
        HashSet.add("женьшень");
        HashSet.add("земляника");
        HashSet.add("ирис");
        HashSet.add("картофель");

        Iterator<String> iterator = HashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        //напишите тут ваш код

    }
}
