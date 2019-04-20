package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                                new InputStreamReader(System.in));
        String condition;
        while (!(condition = reader.readLine()).equals("exit")) {
            try {
                Double.parseDouble(condition);
            } catch (Exception e) {
               print(condition);
               continue;
            }
            if (condition.contains(".")) {
                print(Double.parseDouble(condition));
            }else if ((Integer.parseInt(condition) > 0) &&
                (Integer.parseInt(condition) < 128)) {
                print(Short.parseShort(condition));
            }else if ((Integer.parseInt(condition) <= 0) ||
                (Integer.parseInt(condition) >= 128)) {
                print(Integer.parseInt(condition));
            }
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
