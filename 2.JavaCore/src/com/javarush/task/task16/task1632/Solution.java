package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);
    static {
        threads.add(new One());
        threads.add(new Two());
        threads.add(new Three());
        threads.add(new Four());
        threads.add(new Five());

//        threads.forEach(Thread::start);
    }

    public static void main(String[] args) {

    }

    public static class One extends Thread {
        @Override
        public void run() {
            while (true) {
            }
        }
    }

    public static class Two extends Thread {
        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println("InterruptedException");
                }
            }
        }
    }

    public static class Three extends Thread {
        @Override
        public void run() {
            while (!isInterrupted()) {
                try {
                    System.out.println("Ура");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static class Four extends Thread implements Message {
        @Override
        public void showWarning() {
            this.interrupt();
        }

        @Override
        public void run() {
            while (!isInterrupted()) {

            }
        }
    }

    public static class Five extends Thread {
        @Override
        public void run() {
            BufferedReader reader = new BufferedReader(
                                    new InputStreamReader(System.in));

            String s;
            double result = 0;
            try {
                while (!(s = reader.readLine()).equals("N")) {

                    try {
                        result += Double.parseDouble(s);
                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                    }

                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(result);
        }
    }
}