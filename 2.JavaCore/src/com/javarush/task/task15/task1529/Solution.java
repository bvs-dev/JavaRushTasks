package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }
    
    static {
        reset();//add your code here - добавьте код тут
    }

    public static CanFly result;

    public static void reset() {
        String par;
        try {
            BufferedReader reader = new BufferedReader(
                                    new InputStreamReader(System.in));
            par = reader.readLine();
            if (par.equals("helicopter")) result = new Helicopter();
            if (par.equals("plane")) result = new Plane(Integer.parseInt(reader.readLine()));//add your code here - добавьте код тут
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
