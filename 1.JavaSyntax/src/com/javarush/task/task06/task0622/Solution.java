package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int y;
        int nums [] = new int[5];

        for (int i = 0; i < 5; i++) nums[i] = Integer.parseInt(reader.readLine());

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (nums[j] > nums[j + 1]) {
                    y = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = y;//напишите тут ваш код
                }
            }
        }
    for (int i = 0; i < 5; i++) System.out.println(nums[i]);
    }
}
