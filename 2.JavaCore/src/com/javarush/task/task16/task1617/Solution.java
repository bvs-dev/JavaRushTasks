package com.javarush.task.task16.task1617;

/* 
Отсчет на гонках
*/

public class Solution {
    public static volatile int numSeconds = 3;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        /*Thread t = new Thread(clock);//add your code here - добавь код тут
        t.start();*/
        Thread.sleep(3500);
        clock.interrupt();

    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            while (numSeconds >= 0) {
                try {
                    if (numSeconds > 0) {
                        System.out.print(numSeconds + " ");
                        numSeconds--;
                        Thread.sleep(1000);
                    } else  {
                        System.out.println("Марш!");
                        numSeconds--;
                    }
                } catch (InterruptedException e) {
                    System.out.println("Прервано!");
                    return;
                }
            }
        }
    }
}