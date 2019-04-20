package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.util.Scanner;



public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int sum = 0;
        while (true) {
            int number = sc.nextInt();
            if (number == -1) {
                sum += -1;
                break;
            }
            else sum += number;
        }
        System.out.print(sum);
        sc.close();//напишите тут ваш код
    }
}
