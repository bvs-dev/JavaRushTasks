package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int one = sc.nextInt();
        int two = sc.nextInt();
        int three = sc.nextInt();

        if ((one == two) & (three != one)) System.out.println("3");
        if ((one == three) & (two != one)) System.out.println("2");
        if ((two == three) & (one != two)) System.out.println("1");

        sc.close();//напишите тут ваш код
    }
}
