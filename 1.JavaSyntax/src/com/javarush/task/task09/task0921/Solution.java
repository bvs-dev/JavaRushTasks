package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();

        try {

            do {
                list.add (Integer.parseInt(reader.readLine()));
            } while (true);
        } catch (NumberFormatException e) {
            list.forEach(System.out::println);
        } catch (IOException e) {
            list.forEach(System.out::println);
        }
        //напишите тут ваш код
    }
}
