package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> mainlist = new ArrayList<>();
        ArrayList<Integer> three = new ArrayList<>();
        ArrayList<Integer> two = new ArrayList<>();
        ArrayList<Integer> other = new ArrayList<>();

        BufferedReader reader = new
                BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 20; i++) mainlist.add(Integer.parseInt(reader.readLine()));

        for (int i = 0; i <20; i++) {
            if (mainlist.get(i) % 3 == 0) three.add(mainlist.get(i));
            if (mainlist.get(i) % 2 == 0) two.add(mainlist.get(i));
            if ((mainlist.get(i) % 3 != 0) & (mainlist.get(i) % 2 != 0))
                other.add(mainlist.get(i));//напишите тут ваш код
        }

        printList(three);
        printList(two);
        printList(other);
    }

    public static void printList(List<Integer> list) {
        list.forEach(System.out::println);//напишите тут ваш код
    }
}
