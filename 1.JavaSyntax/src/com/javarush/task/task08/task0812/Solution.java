package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            list.add (Integer.parseInt(reader.readLine()));//напишите тут ваш код
        }
        int y = 1;
        int max = 0;
        for (int i = 0; i < 9; i++) {
            if (list.get(i).equals(list.get(i+1))) y++;
            else {
                max = max < y ? y : max;
                y = 1;
            }
        }
        max = max < y ? y : max;
        System.out.println(max);
    }
}