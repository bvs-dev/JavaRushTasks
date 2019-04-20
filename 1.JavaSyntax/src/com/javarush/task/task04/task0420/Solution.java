package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y;

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        for (int i = 0; i < 3; i++) {
            if (c > b) {
                y = c;
                c = b;
                b = y;
            }
            if (b > a) {
                y = b;
                b = a;
                a = y;
            }
            //напишите тут ваш код
        }
        System.out.println(a + " " + b + " " + c);
    }
}
