package com.walking.lesson17_Enum.task1;
/*
Написать программу, которая принимает строку с клавиатуры. Если строка == "Hi" - вывести в консоль "Hello",
если Bye - Good bye, если How are you - How are your doing. Если любая другая строка - вывести Unknown message.
 Сделать через:
 1)   if-else
2)   switch-case
Примечание: для сравнения строк некорректно использовать оператор "==", почему - разберем позже.
Можно воспользоваться методом equals().
Например: "Hi".equals(s); или s.equals("Hi");
Рейлизуйте задачу через enum. В т.ч. реализуйте в enum'е поиск значения по фразе, введенной пользователем. Напоминаю,
что enum'ы могут содержать поля.
 */

import java.util.Scanner;

import static com.walking.lesson17_Enum.task1.GreetingType.findGreetingType;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String greeting = scanner.nextLine();
        scanner.close();
        findGreetingType(greeting);
    }
}
