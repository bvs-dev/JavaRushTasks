package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) { //return 10
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }



        for (int a = 0; a < 33; a++) {
            int x = 0;
            for (int s = 0; s < 10; s++) {

                for (int ch = 0; ch < list.get(s).length(); ch++) {
                    if (list.get(s).charAt(ch) == alphabet.get(a)) {
                        x++;
                    }
                }
            }
            System.out.println(alphabet.get(a) + " " + x);
        }
    }

}
