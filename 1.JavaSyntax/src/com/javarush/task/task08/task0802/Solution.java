package com.javarush.task.task08.task0802;

/* 
HashMap из 10 пар
*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        HashMap<String, String> HashMap = new HashMap<>();
        HashMap.put("арбуз","ягода");//напишите тут ваш код
        HashMap.put("банан","трава");//напишите тут ваш код
        HashMap.put("вишня","ягода");//напишите тут ваш код
        HashMap.put("груша","фрукт");//напишите тут ваш код
        HashMap.put("дыня","овощ");//напишите тут ваш код
        HashMap.put("ежевика","куст");//напишите тут ваш код
        HashMap.put("жень-шень","корень");//напишите тут ваш код
        HashMap.put("земляника","ягода");//напишите тут ваш код
        HashMap.put("ирис","цветок");//напишите тут ваш код
        HashMap.put("картофель","клубень");

        Iterator<HashMap.Entry<String, String>> iterator = HashMap.entrySet().iterator();

        while (iterator.hasNext()) {
            HashMap.Entry<String, String> pair= iterator.next();
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " - " + value);//напишите тут ваш код
        }
    }
}
