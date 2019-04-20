package com.javarush.task.task05.task0529;

import java.util.Scanner;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while (true) {
            if (sc.hasNextInt()) sum += sc.nextInt();
            else if (sc.hasNext()) {
                String str = sc.nextLine();
                if (str.equals("сумма")) break;//напишите тут ваш код
            }
        }
        System.out.println(sum);
    }
}
