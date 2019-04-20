package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1980"));
        map.put("adklasd", df.parse("APRIL 2 2018"));
        map.put("sdfsdf", df.parse("MARCH 5 1996"));
        map.put("sdfsdfasdf", df.parse("APRIL 2 2018"));
        map.put("sdfsaaa", df.parse("APRIL 2 2018"));
        map.put("asdasddasdfs", df.parse("APRIL 2 2018"));
        map.put("s", df.parse("APRIL 2 2018"));
        map.put("sdfs", df.parse("AUGUST 2 2018"));
        map.put("sdfsf", df.parse("JULY 2 2018"));
        map.put("ssf", df.parse("JUNE 2 2018"));

        return map;//напишите тут ваш код
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();//напишите тут ваш код
        while (iterator.hasNext()) {
            Map.Entry<String, Date> itr = iterator.next();
            if ((itr.getValue().toString().contains("Jun")) ||
                (itr.getValue().toString().contains("Jul")) ||
                (itr.getValue().toString().contains("Aug")))
                iterator.remove();
        }
    }

    public static void main(String[] args) throws ParseException{
//        removeAllSummerPeople(createMap());
//        HashMap<String, Date> map1 = new HashMap<>(createMap());
//        for (Map.Entry<String, Date> pair : map1.entrySet()) System.out.println(pair.getValue().toString());
    }
}
