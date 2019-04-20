package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                                new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileReader in = new  FileReader(fileName);

        String result = "";
        while (in.ready()) {
            int ch = in.read();
            result += (char) ch;
        }

        int count = 0;
        Pattern pattern = Pattern.compile("\\bworld\\b", Pattern.UNICODE_CASE|Pattern.CASE_INSENSITIVE);
        Matcher m = pattern.matcher(result);
        while (m.find()) count++;
        System.out.println(count);

        reader.close();
        in.close();
    }
}
