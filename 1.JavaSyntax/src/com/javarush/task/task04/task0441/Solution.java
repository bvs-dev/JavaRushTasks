package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();//напишите тут ваш код
        int b = sc.nextInt();
        int c = sc.nextInt();
        while (true){
            if (((a >= b) && (a <= c)) || ((a <= b) && (a >= c))) {
                System.out.println(a);
                break;
            }
            if (((b >= a) && (b <= c)) || ((b <= a) && (b >= c))) {
                System.out.println(b);
                break;
            }
            if (((c >= b) && (c <= a)) || ((c <= b) && (c >= a))) {
                System.out.println(c);
                break;
            }
        }
    }
}
