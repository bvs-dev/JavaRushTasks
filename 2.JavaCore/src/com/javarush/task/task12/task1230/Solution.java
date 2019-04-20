package com.javarush.task.task12.task1230;

/* 
Попадание в десятку
*/

public class Solution {
    public static void main(String[] args) {
        int x = transformValue(5);

        System.out.println(x);
    }

    public static int transformValue(int i) {
        return i * i;
    }
    public static int transformValue(short i) {
        return i * 2;
    }
}
