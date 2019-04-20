package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.*;
import java.math.BigDecimal;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                                new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream in = new FileInputStream(fileName);

        try (BufferedReader inBuf = new BufferedReader(new InputStreamReader(in))) {
            String c;
            while ((c = inBuf.readLine()) != null) {
                String indexText = c.substring(0, c.indexOf(" "));
                BigDecimal index = new BigDecimal(indexText);
                BigDecimal ourIndex = new BigDecimal(args[0]);
                if (index.intValue() == ourIndex.intValue()) System.out.println(c);
            }
        }

        reader.close();
        in.close();
    }
}
