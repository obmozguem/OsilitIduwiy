package com.walking.lesson30_regex.task1easy;

/*Реализуйте boolean-метод, валидирующий входящую строку. Метод должен возвращать true, если строка соответствует номеру
 мобильного телефона (в качестве примера привожу номер для РФ, вы можете выбрать любой другой, но со схожей маской).
Маска корректного номера: +7 (XXX) XXX-XX-XX, где "X" – цифра от 0 до 9. Обратите внимание на наличие скобок и пробелов.
Вариант с усложнением (*): решите ту же задачу, но символы скобок, дефиса и пробелов – опциональны (каждый из них может
 или присутствовать, как на оригинальной маске, так и отсутствовать вовсе, возможность частичного использования или
 использования символов-разделителей в другом порядке считаем невалидным).
 */

public class Main {
    public static void main(String[] args) {
        System.out.println(isItPhone("+7 (121) 333-23-43"));
        System.out.println(isItPhone("+7 (121) 3332343"));
        System.out.println(isItPhone("+7 121 333-23-43"));
        System.out.println(isItPhone("+7(121)333-23-43"));
        System.out.println(isItPhone("+7(121)3332343"));
        System.out.println(isItPhone("+71213332343"));
        System.out.println(isItPhone("+7 (1121) 333-23-43"));
        System.out.println(isItPhone("+7(121) 333-23-43"));
        System.out.println(isItPhone("+7 121) 333-23-43"));
        System.out.println(isItPhone("+7 (121)333-23-43"));
        System.out.println(isItPhone("+(7 121)333-23-43"));
        System.out.println(isItPhone("+7 (121) 333-2343"));
    }
     public static boolean isItPhone (String input){
         return input.matches("^\\+7 \\(\\d{3}\\) \\d{3}-\\d{2}-d{2}$");
     }
}
