package com.javarush.task.task06.task0609;

/* 
Расстояние между двумя точками
*/

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        double dist = (double) Math.sqrt(((x1-x2)*(x1-x2)) + ((y1-y2)*(y1-y2)));
        return dist;//напишите тут ваш код
    }

    public static void main(String[] args) {
        System.out.println(Util.getDistance(1,1,4,5));
    }
}
