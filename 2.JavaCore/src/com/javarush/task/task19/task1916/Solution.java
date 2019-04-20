package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                                new InputStreamReader(System.in));

        String file1 = reader.readLine();
        String file2 = reader.readLine();

        reader.close();

        BufferedReader in1 = new BufferedReader(new FileReader(file1));
        BufferedReader in2 = new BufferedReader(new FileReader(file2));

        String str1 = "";
        String str2 = "" ;

        while (((str1 = in1.readLine()) != null) || ((str2 = in2.readLine()) != null)) {
            if (str1 == null) str1 = "";
            if (str2 == null) str2 = "";
            if (str1.equals(str2)) {
                lines.add(new LineItem(Type.SAME, str1));}
            if (!str1.equals(str2)) {
                if (str1.trim().isEmpty()) lines.add(new LineItem(Type.ADDED, str2));
                if (str2.trim().isEmpty()) lines.add(new LineItem(Type.REMOVED, str1));
            }
        }
        in1.close();
        in2.close();
        lines.forEach(item -> System.out.println(item.toString()));
    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }

        @Override
        public String toString() {
            return type.toString() + line;
        }
    }
}
