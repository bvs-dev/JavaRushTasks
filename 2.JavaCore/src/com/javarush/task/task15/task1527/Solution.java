package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                                new InputStreamReader(System.in));

        String url = reader.readLine();
        url = url.substring(url.indexOf("?") + 1);

        for (int i = 0; i < url.length(); i++) {

            if ((url.charAt(i) != '=') && (url.charAt(i) != '&')) {
                System.out.print(url.charAt(i));
            }
            if (url.charAt(i) == '&') System.out.print(" ");
            if (url.charAt(i) == '=') {
                System.out.print(" ");
                while ((url.charAt(i) != '&') && (i < url.length() - 1)) {
                    i++;
                }
            }
        }
        System.out.println();

        if (url.contains("obj")) {
            String svalue = "";
            for (int i = url.indexOf("obj") + 4; ; i++) {
                if (url.charAt(i) != '&') svalue += url.charAt(i);
                if ((url.charAt(i) == '&') || (i == url.length() -1)) break;
            }
            try {

                    alert(Double.parseDouble(svalue));

            } catch (Exception e) {
                alert(svalue);
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
