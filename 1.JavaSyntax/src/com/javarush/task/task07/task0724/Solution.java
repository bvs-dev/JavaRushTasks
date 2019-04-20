package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human ded = new Human("ded", true, 60);
        Human babka = new Human("bab", false, 60);
        Human ded1 = new Human("ded1", true, 60);
        Human babka1 = new Human("bab1", false, 60);
        Human papa = new Human("papa", true, 30, ded, babka);
        Human mama = new Human("mama", false, 30, ded1, babka1);
        Human det = new Human("name", true, 2, papa, mama);
        Human det1 = new Human("name1", true, 2, papa, mama);
        Human det2 = new Human("name2", true, 2, papa, mama);

        System.out.println(ded.toString());
        System.out.println(ded1.toString());
        System.out.println(babka.toString());
        System.out.println(babka1.toString());
        System.out.println(papa.toString());
        System.out.println(mama.toString());
        System.out.println(det.toString());
        System.out.println(det1.toString());
        System.out.println(det2.toString());// напишите тут ваш код
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human (String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }// напишите тут ваш код

        public Human (String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}