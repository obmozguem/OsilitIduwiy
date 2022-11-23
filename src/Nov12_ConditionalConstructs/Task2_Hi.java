package Nov12_ConditionalConstructs;

import java.util.Scanner;

/*Написать программу, которая принимает строку с клавиатуры. Если строка == "Hi" - вывести в консоль "Hello",
если Bye - Good bye, если How are you - How are your doing. Если любая другая строка - вывести Unknown message.
 Сделать через:
 1)   if-else
2)   switch-case
Примечание: для сравнения строк некорректно использовать оператор "==", почему - разберем позже.
Можно воспользоваться методом equals().
Например: "Hi".equals(s); или s.equals("Hi"); */
public class Task2_Hi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        switch (st) {
            case "Hi":
                System.out.println("Hello");
                break;
            case "Bye":
                System.out.println("Good Bye");
                break;
            default:
                System.out.println("Unknown message");
        }
    }
}
