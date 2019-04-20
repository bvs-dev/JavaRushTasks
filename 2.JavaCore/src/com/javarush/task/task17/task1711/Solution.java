package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException{
        if (args.length > 0) {
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/y", Locale.ENGLISH);

          /*  if (args[0].equals("-c")) {
                for (int i = 1; i < args.length; i++) {
                    if (args[i+1].toLowerCase().equals("м")) {
                        try {
                            allPeople.add(Person.createMale(args[i], format.parse(args[i+2])));
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                    }

                    if (args[i+1].toLowerCase().equals("ж")) {
                        try {
                            allPeople.add(Person.createFemale(args[i], format.parse(args[i+2])));
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                    }
                    i += 2;
                    System.out.println(allPeople.size() - 1);
                }

            }

            if (args[0].equals("-u")) {
                for (int i = 1; i < args.length; i++) {
                    if (Integer.parseInt(args[1]) < allPeople.size()) {
                        allPeople.get(Integer.parseInt(args[i])).setName(args[i+1]);
                        allPeople.get(Integer.parseInt(args[i])).setSex(args[i+2].equals("М") ? Sex.MALE: Sex.FEMALE);
                        try {
                            allPeople.get(Integer.parseInt(args[i])).setBirthDate(format.parse(args[i+3]));
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                    }
                    i += 2;
                }
            }

            if (args[0].equals("-d")) {
                for (int i = 1; i < args.length; i++) {
                    if (Integer.parseInt(args[i]) < allPeople.size()) {
                        allPeople.get(Integer.parseInt(args[i])).setName(null);
                        allPeople.get(Integer.parseInt(args[i])).setSex(null);
                        allPeople.get(Integer.parseInt(args[i])).setBirthDate(null);
                    }
                }
            }

            if (args[0].equals("-i")) {
                for (int i = 1; i < args.length; i++) {
                    if (Integer.parseInt(args[i]) < allPeople.size()) {
                        SimpleDateFormat newf = new SimpleDateFormat("dd-MMM-y", Locale.ENGLISH);
                        Date d = allPeople.get(Integer.parseInt(args[i])).getBirthDate();

                        System.out.print(allPeople.get(Integer.parseInt(args[i])).getName() + " ");
                        System.out.print(allPeople.get(Integer.parseInt(args[i])).getSex().toString().equals("MALE") ? "м" + " " : "ж" + " ");
                        System.out.print(newf.format(d));
                    }
                }
            }*/

            switch (args[0]) {
                case "-c":
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length; i++) {
                            if (args[i+1].toLowerCase().equals("м")) {
                                try {
                                    allPeople.add(Person.createMale(args[i], format.parse(args[i+2])));
                                } catch (ParseException e) {
                                    e.printStackTrace();
                                }
                            }

                            if (args[i+1].toLowerCase().equals("ж")) {

                                    allPeople.add(Person.createFemale(args[i], format.parse(args[i+2])));

                            }
                            i += 2;
                            System.out.println(allPeople.size() - 1);
                        }
                    }
                    break;

                case "-u":
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length; i+= 4) {
                            allPeople.get(Integer.parseInt(args[i])).setName(args[i+1]);
                            allPeople.get(Integer.parseInt(args[i])).setSex(args[i+2].toLowerCase().equals("м") ? Sex.MALE : Sex.FEMALE);
                            allPeople.get(Integer.parseInt(args[i])).setBirthDate(format.parse(args[i+3]));
                        }
                    }
                    break;

                case "-d":
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length; i++) {
                            if (Integer.parseInt(args[i]) < allPeople.size()) {
                                allPeople.get(Integer.parseInt(args[i])).setName(null);
                                allPeople.get(Integer.parseInt(args[i])).setSex(null);
                                allPeople.get(Integer.parseInt(args[i])).setBirthDate(null);
                            }
                        }
                    }
                    break;

                case "-i":
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length; i++) {
                            if (Integer.parseInt(args[i]) < allPeople.size()) {
                                SimpleDateFormat newf = new SimpleDateFormat("dd-MMM-y", Locale.ENGLISH);
                                Date d = allPeople.get(Integer.parseInt(args[i])).getBirthDate();

                                System.out.print(allPeople.get(Integer.parseInt(args[i])).getName() + " ");
                                System.out.print(allPeople.get(Integer.parseInt(args[i])).getSex().toString().equals("MALE") ? "м" + " " : "ж" + " ");
                                System.out.println(newf.format(d));
                            }
                        }
                    }
                    break;
            }





        }
    }
}
