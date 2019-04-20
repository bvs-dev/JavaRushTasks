package com.javarush.task.task16.task1603;

import java.util.ArrayList;
import java.util.List;

/* 
Список и нити
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        SpecialThread ob1 = new SpecialThread();
        list.add(new Thread(ob1));
        SpecialThread ob2 = new SpecialThread();
        list.add(new Thread(ob2));
        SpecialThread ob3 = new SpecialThread();
        list.add(new Thread(ob3));
        SpecialThread ob4 = new SpecialThread();
        list.add(new Thread(ob4));
        SpecialThread ob5 = new SpecialThread();
        list.add(new Thread(ob5));

//        list.get(2).start();

    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
