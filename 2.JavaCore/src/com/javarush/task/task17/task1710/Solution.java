package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        if (args.length > 0) {
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/y",Locale.ENGLISH);

            if (args[0].equals("-c")) {
                if (args[2].toLowerCase().equals("м")) {
                    try {
                        allPeople.add(Person.createMale(args[1], format.parse(args[3])));
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                }

                if (args[2].toLowerCase().equals("ж")) {
                    try {
                        allPeople.add(Person.createFemale(args[1], format.parse(args[3])));
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(allPeople.size() - 1);
            }

            if (args[0].equals("-u")) {
                if (Integer.parseInt(args[1]) < allPeople.size()) {
                    allPeople.get(Integer.parseInt(args[1])).setName(args[2]);
                    allPeople.get(Integer.parseInt(args[1])).setSex(args[3].equals("М") ? Sex.MALE: Sex.FEMALE);
                    try {
                        allPeople.get(Integer.parseInt(args[1])).setBirthDate(format.parse(args[4]));
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                }
            }

            if (args[0].equals("-d")) {
                if (Integer.parseInt(args[1]) < allPeople.size()) {
                    allPeople.get(Integer.parseInt(args[1])).setName(null);
                    allPeople.get(Integer.parseInt(args[1])).setSex(null);
                    allPeople.get(Integer.parseInt(args[1])).setBirthDate(null);
                }
            }

            if (args[0].equals("-i")) {
                if (Integer.parseInt(args[1]) < allPeople.size()) {
                    SimpleDateFormat newf = new SimpleDateFormat("dd-MMM-y", Locale.ENGLISH);
                    Date d = allPeople.get(Integer.parseInt(args[1])).getBirthDate();
                    System.out.print(allPeople.get(Integer.parseInt(args[1])).getName() + " ");
                    System.out.print(allPeople.get(Integer.parseInt(args[1])).getSex().toString().equals("MALE") ? "м" + " " : "ж" + " ");
                    System.out.print(newf.format(d));
                }
            }
        }
    }
}
