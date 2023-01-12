package com.walking.lesson31;

import java.io.*;

/* Буферизация – загрузка части файла, происходящая во время потоковой передачи (например музыки или видео до их
воспроизведения). Например, загрузка видео по ютуб – часть видео загрузилась и мы её смотри, пока мы смотри какую-то
 часть, оставшаяся часть продолжает загружаться.
БафферРидер/райтер это обёртки – они обрачиват ФайлРидер/райтиер (ИнпутСтрим/ОутпутСтрим) и добавляют
функциональность буферизации.
 */
public class BufferdReader_writter {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("test2.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("test3.txt"))) {
            int character;
            while ((character = reader.read()) != -1) {
                writer.write(character);
            }
            /* вместо 17-18 строк можно было использовать метод ридЛайн у Баффердридера и написать так:
            String line;
            while ((line = reader.readLine()) != null) {
            writer.write(line);
            writer.write('\n'); }
             */
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
