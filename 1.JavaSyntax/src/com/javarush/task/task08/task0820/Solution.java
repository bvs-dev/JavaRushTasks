package com.javarush.task.task08.task0820;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> result = new HashSet<>();

        for (int i = 0; i < 4; i++) result.add(new Cat());//напишите тут ваш код

        return result;
    }

    public static Set<Dog> createDogs() {

        HashSet<Dog> result = new HashSet<>();

        for (int i = 0; i < 3; i++) result.add(new Dog());

        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        HashSet<Object> result = new HashSet<>();
        Iterator<Cat> itrC = cats.iterator();
        Iterator<Dog> itrD = dogs.iterator();

        while (itrC.hasNext()) {
            result.add(itrC.next());
        }
        while (itrD.hasNext()) {
            result.add(itrD.next());
        }
        return result;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        HashSet<Object> cat = new HashSet<>(cats);

        pets.removeAll(cat);
    }

    public static void printPets(Set<Object> pets) {
        pets.forEach(System.out::println);//напишите тут ваш код
    }

    public static class Cat {

    }
    public static class Dog {

    }//напишите тут ваш код
}
