package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        Human child = new Human("perviy", true, 15);
        Human child1 = new Human("vtoraya", false, 10);
        Human child2 = new Human("nenash", true, 9);
        Human pap = new Human("papan", true, 50, child1, child2, child);
        Human mam = new Human("maman", false, 50, child1, child2, child);
        Human bab1 = new Human("babanize", false, 90, mam);
        Human bab = new Human("baban", false, 90, pap);
        Human ded1 = new Human("dedanize", true, 80, mam);//напишите тут ваш код
        Human ded = new Human("dedan", true, 80, pap);//напишите тут ваш код

        System.out.println(child.toString());
        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(pap.toString());
        System.out.println(mam.toString());
        System.out.println(bab.toString());
        System.out.println(bab1.toString());
        System.out.println(ded.toString());
        System.out.println(ded1.toString());
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();//напишите тут ваш код

        Human(String name, boolean sex, int age, Human par1, Human par2) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children.add(par1);
            this.children.add(par2);
        }

        Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        Human(String name, boolean sex, int age, Human par1) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children.add(par1);
        }

        Human(String name, boolean sex, int age, Human par1, Human par2, Human par3) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children.add(par1);
            this.children.add(par2);
            this.children.add(par3);

        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
