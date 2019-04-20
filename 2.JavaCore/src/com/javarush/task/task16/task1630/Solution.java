package com.javarush.task.task16.task1630;

import java.io.*;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    static BufferedReader reader = new BufferedReader(
                            new InputStreamReader(System.in));
    static {
        try {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//add your code here - добавьте код тут

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();//add your code here - добавьте код тут
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface {
        private String fileName;
        @Override
        public void setFileName(String fullFileName) {
            this.fileName = fullFileName;
        }

        String result = "";

        @Override
        public String getFileContent() {
            return result;
        }


        @Override
        public void run() {
            String c;
            try (FileReader r = new FileReader(fileName)) {
                BufferedReader reader = new BufferedReader(r);
                while ((c = reader.readLine()) != null) {
                    result = result + c + " ";
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
