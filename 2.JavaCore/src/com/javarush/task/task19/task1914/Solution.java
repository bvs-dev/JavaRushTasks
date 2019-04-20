package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.math.BigInteger;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);

        testString.printSomething();

        String result = outputStream.toString().replaceAll("[\\n\\r]*", "");




        System.setOut(consoleStream);
        System.out.println(Solution.calculate(result));
    }

    public static String calculate (String str) {
        String operation = str.replaceAll("[^-+*]+", "");
        String[] array = str.split("[^0-9]+");

        BigInteger x = new BigInteger(array[0]);
        BigInteger y = new BigInteger(array[1]);

        String result = null;

        if (operation.equals("+")) result = str + x.add(y).toString();
        if (operation.equals("-")) result = str + x.subtract(y).toString();
        if (operation.equals("*")) result = str + x.multiply(y).toString();
        return result;
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

