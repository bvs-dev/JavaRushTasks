package com.javarush.task.task14.task1420;
import java.io.*;
/* 
НОД
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int firstNumber = 0;
        int secondNumber = 0;


        firstNumber = Integer.parseInt(reader.readLine());
        secondNumber = Integer.parseInt(reader.readLine());

        if ((firstNumber <= 0) || (secondNumber <= 0)) throw new NumberFormatException();


        if ((firstNumber !=0) && (secondNumber !=0)) {
            while ((firstNumber != 0) && (secondNumber != 0)) {
                if (firstNumber > secondNumber) firstNumber %= secondNumber;
                else secondNumber %= firstNumber;
            }
        }
        System.out.println(firstNumber + secondNumber);

    }
}
