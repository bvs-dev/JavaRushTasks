package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    static {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        String file1 = null;
        String file2 = null;
        try {
            file1 = reader.readLine();
            file2 = reader.readLine();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Thread thread1 = new Thread(new Reader1(file1));
        Thread thread2 = new Thread(new Reader2(file2));

        thread1.start();
        thread2.start();
    }

    public static void main(String[] args) throws IOException {
        Solution s = new Solution();
        s.joinData();
    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else {
            while (allLines.size() > 0) {
                allLines.remove(0);
            }
            throw new CorruptedDataException();
        }

    }

    public static class Reader1 implements Runnable {
        private String fileName1;

        public Reader1(String fileName1) {
            this.fileName1 = fileName1;
        }

        public void run() {
            try (FileReader f1 = new FileReader(fileName1)) {
                BufferedReader reader = new BufferedReader(f1);
                String line;

                while ((line = reader.readLine()) != null) {
                    allLines.add(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static class Reader2 implements Runnable {
        private String fileName2;

        public Reader2(String fileName2) {
            this.fileName2 = fileName2;
        }

        public void run() {
            try (FileReader f2 = new FileReader(fileName2)) {
                BufferedReader reader = new BufferedReader(f2);
                String line;

                while ((line = reader.readLine()) != null) {
                    forRemoveLines.add(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
