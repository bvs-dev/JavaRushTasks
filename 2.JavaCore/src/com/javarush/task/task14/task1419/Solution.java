package com.javarush.task.task14.task1419;

import java.io.IOException;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            Exception ex = exceptions.get(-1);//напишите тут ваш код
        } catch (Exception e) {
            exceptions.add(e);
        }
        Exception exception = new NullPointerException();
        exceptions.add(exception);//3
        exception = new ArrayIndexOutOfBoundsException();
        exceptions.add(exception);//4
        exception = new ClassCastException();
        exceptions.add(exception);//5
        exception = new StringIndexOutOfBoundsException();
        exceptions.add(exception);//6
        exception = new NoSuchFieldException();
        exceptions.add(exception);//7
        exception = new RuntimeException();
        exceptions.add(exception);//8
        exception = new IllegalArgumentException();
        exceptions.add(exception);//9
        exception = new EmptyStackException();
        exceptions.add(exception);//10

    }
}
