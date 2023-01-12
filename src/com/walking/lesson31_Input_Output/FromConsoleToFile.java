package com.walking.lesson31_Input_Output;

import java.io.*;

public class FromConsoleToFile {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new FileWriter("notes5.txt"))) {
            // чтение построчно
            String text;
            while (!(text = br.readLine()).equals("ESC")) {

                bw.write(text + "\n");
                bw.flush();
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
  /*Здесь объект BufferedReader устанавливается для чтения с консоли с помощью объекта new InputStreamReader(System.in).
   В цикле while считывается введенный текст. И пока пользователь не введет строку "ESC", объект BufferedWriter будет
   записывать текст файл. */

}

