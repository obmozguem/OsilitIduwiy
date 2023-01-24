package com.walking.lesson34_Data_time.task2;

/* Реализуйте программу, выводящую в консоль сообщение, являются ли введенные с клавиатуры дата и время больше или
меньше текущего. Формат вводимых даты и времени рекомендую взять из Задачи 1.
 */

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static final String PATTERN = "dd.MM.yyyy HH:mm:ss";
    public static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern(PATTERN);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        LocalDateTime enteredDay = parseDate(str);
        LocalDateTime nowDay = LocalDateTime.now();

        if (nowDay.isBefore(enteredDay)) {
            System.out.println("Date is before now");
        } else if (nowDay.isAfter(enteredDay)) {
            System.out.println("Date is before now");
        } else {
            System.out.println("Dates are equals");
        }
    }

    private static LocalDateTime parseDate(String str) {
        return LocalDateTime.parse(str, FORMATTER);
    }
}
