package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int i = 0;
        int v;

        while (true) {
            v= sc.nextInt();
            if (v == -1) break;
            sum += v;
            i++;//напишите тут ваш код
        }
        System.out.println((double)sum/i);
        sc.close();
    }
}

