package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        char[] array = str.toCharArray();

        for (int i = 0; i <array.length; i++) {
            if (isVowel(array[i]) && array[i] != ' ') System.out.print(array[i] + " ");//напишите тут ваш код
        }
        System.out.println();
        for (int i = 0; i <array.length; i++) {
            if (!isVowel(array[i])&& array[i] != ' ') System.out.print(array[i] + " ");//напишите тут ваш код
        }


    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}