package com.javarush.task.task05.task0532;


import java.util.Scanner;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maximum = 0;
        int a = sc.nextInt();
        int val = a>0 ? a : 0;

        for (int i = 0; i < val; i++) {
            int b = sc.nextInt();
            maximum = i == 0 ? b : maximum;
            maximum = b > maximum ? b : maximum;
        }



        //напишите тут ваш код

        System.out.println(maximum);
    }
}
