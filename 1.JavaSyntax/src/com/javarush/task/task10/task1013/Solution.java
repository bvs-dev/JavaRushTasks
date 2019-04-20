package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private int i;
        private boolean b;
        private char ch;
        private String s;
        private long l;
        private float f;

        public Human(int i) {
            this.i = i;
        }
        public Human(boolean b) {
            this.b = b;
        }
        public Human(char ch) {
            this.ch = ch;
        }
        public Human(String s) {
            this.s = s;
        }
        public Human(long l) {
            this.l = l;
        }
        public Human(float f) {
            this.f = f;
        }
        public Human(int i, float f) {
            this.i = i;
            this.f = f;
        }
        public Human(int i, boolean b) {
            this.i = i;
            this.b = b;
        }
        public Human(float f, long l) {
            this.f = f;
            this.l = l;
        }
        public Human() { }
    }
}
