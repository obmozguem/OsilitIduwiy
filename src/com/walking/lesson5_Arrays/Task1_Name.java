package com.walking.lesson5_Arrays;

/*Создать массив char, заполненный буквами своего имени в верном порядке. Используя этот массив,
вывести свое имя в консоль.
Вариант 1: не используя переменную типа String;
Вариант 2: предварительно собрав значения массива в переменную типа String.
Подсказка для варианта 2: создать пустую строку можно так: String s = “”;*/

public class Task1_Name {
    public static void main(String[] args) {
        char [] name = {'o', 'l', 'e', 'n', 'k', 'a'};
/*for(char s: name){
    System.out.print(s);
}*/
        String st="";
        for(char s: name){
            st = st+s;
        }
        System.out.println(st);
    }
}
