package com.walking.lesson8;
/*Реализовать класс-счетчик. Полями класса должны выступать название счетчика и, непосредственно, целочисленный счетчик.
Реализовать для созданного класса конструктор с двумя параметрами, с одним (значение счетчика в таком случае
инициализировать как 0), методы увеличения и уменьшения счетчиков на 1 и на заданное пользователем целом значение.
Методы должны возвращать актуальное значение счетчика.
Используя созданный класс, посчитать количество четных и количество нечетных чисел в ряду от 1 до 100. Конечные
показатели счетчиков вывести в консоль.
Пример вывода в консоли:
    Нечетные числа: 50
    Четные числа: 50*/

public class Schetchik {
    public static void main(String[] args) {
        Count evenCounter = new Count("Четные числа");
        Count oddCounter = new Count("Нечетные числа");

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                evenCounter.increment();
            } else {
                oddCounter.increment();
            }
        }

        printCounterValue(evenCounter);
        printCounterValue(oddCounter);
    }

    static void printCounterValue(Count counter) {
        System.out.printf("%s: %d\n", counter.name, counter.counter);
    }
}
