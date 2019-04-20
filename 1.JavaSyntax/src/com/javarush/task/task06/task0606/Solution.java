package com.javarush.task.task06.task0606;

import java.util.Scanner;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numb = Math.abs(sc.nextInt());
        int dig = (int) (Math.log10(numb) + 1);

        if (numb == 0) even++;

        for (int i = 0; i <dig; i++) {
            if ((numb%10)%2 == 0) even++;
            else odd++;
            numb /= (int) 10;//напишите тут ваш код
        }
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
