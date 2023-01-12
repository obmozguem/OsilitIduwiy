package com.walking.lesson31;
import java.io.*;
import java.util.Scanner;

/* На PrintStream похож другой класс PrintWriter. Его можно использовать как для вывода информации на консоль, так и в
 файл или любой другой поток вывода.
 Для записи данных в поток он также используется методы printf() и println().
 Пример вывода данным классом на консоль:
 */

public class PrintWriter {
    public static void main(String[] args) {
        try(PrintWriter pw = new PrintWriter(System.out))
        {
            pw.println("Hello world!");
        }
    }
}
