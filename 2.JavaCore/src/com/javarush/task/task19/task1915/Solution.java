package com.javarush.task.task19.task1915;

/* 
Дублируем текст
*/

import java.io.*;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {

        PrintStream consoleStream = System.out;
        BufferedReader reader = new BufferedReader(
                                new InputStreamReader(System.in));

        String name = reader.readLine();
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);

        testString.printSomething();

        System.setOut(consoleStream);
        String content = outputStream.toString();

        FileOutputStream out = new FileOutputStream(name);
        out.write(outputStream.toByteArray(), 0, outputStream.size());
        System.out.println(content);
        reader.close();
        out.close();
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

