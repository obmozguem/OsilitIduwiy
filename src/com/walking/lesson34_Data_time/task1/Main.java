package com.walking.lesson34_Data_time.task1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*Реализуйте метод, возвращающий объект LocalDateTime на основании переданной строки. Пример входящей строки:
 20.12.2022 20:16:00.
 */
public class Main {
    public static final String LDT_FORMAT = "dd.MM.yyyy HH:mm:ss";
    public static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern(LDT_FORMAT);

    public static void main(String[] args) {
        System.out.println(parseDate("25.01.1987 14:10:00"));
    }

    private static LocalDateTime parseDate (String str){
        return LocalDateTime.parse(str, FORMATTER);
    }
}
