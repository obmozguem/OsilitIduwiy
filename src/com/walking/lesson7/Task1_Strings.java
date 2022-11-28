package com.walking.lesson7;
/*Написать программу, которая объединяет любое количество строк, объединяя их через пробел. Реализацию конкатенации
строк вынести в отдельный метод.
 */
public class Task1_Strings {
    public static void main(String[] args) {
        String st = concat("a", "b", "c", "d", "e", "f", "g");

        System.out.println(st);
    }
    static String concat (String ... strings) {
        if (strings.length == 0) {
            return "";
        }

        String result = "";

        for (String s : strings) {
            result += " " + s;
        }

        return result;
    }

    }

