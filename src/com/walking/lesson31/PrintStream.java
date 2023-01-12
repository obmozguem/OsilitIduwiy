package com.walking.lesson31;

/* Класс PrintStream - это именно тот класс, который используется для вывода на консоль. Когда мы выводим на консоль
некоторую информацию с помощью вызова System.out.println(), то тем самым мы задействует PrintStream, так как переменная
out в классе System как раз и представляет объект класса PrintStream, а метод println() - это метод класса PrintStream.
 */

import java.io.*;

public class PrintStream {
    public static void main(String[] args) {

        // ЗАПИСЬ В ФАЙЛ

        String text = "Привет мир!"; // строка для записи
        try (FileOutputStream fos = new FileOutputStream("C://SomeDir//notes3.txt");
             PrintStream printStream = new PrintStream(fos)) {
            printStream.println(text);
            System.out.println("Запись в файл произведена");
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
        /*В качестве потока вывода используется объект FileOutputStream. С помощью метода println() производится запись
        информации в выходной поток - то есть в объект FileOutputStream. (В случае с выводом на консоль с помощью
         System.out.println() в качестве потока вывода выступает консоль) */

        // ЧТЕНИЕ С ФАЙЛА

        try(PrintStream printStream = new PrintStream("notes4.txt"))
        {
            printStream.print("Hello World!");
            printStream.println("Welcome to Java!");

            printStream.printf("Name: %s Age: %d \n", "Tom", 34);

            String message = "PrintStream";
            byte[] message_toBytes = message.getBytes();
            printStream.write(message_toBytes);

            System.out.println("The file has been written");
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}

