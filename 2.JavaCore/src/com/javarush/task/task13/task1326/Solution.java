package com.javarush.task.task13.task1326;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        BufferedReader inStream = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));


        ArrayList<Integer> list = new ArrayList<>();


        while (inStream.ready()) {
            int number =Integer.parseInt(inStream.readLine());
            if (number%2 == 0) list.add(number);// напишите тут ваш код
        }
        inStream.close();
        reader.close();

        Collections.sort(list);
        list.forEach(System.out::println);
    }
}
