package com.walking.lesson20_exeption.task1_catchExeption;
/*Создайте массив, имитирующий простейшую файловую систему и содержащий объекты файлов.
Реализуйте класс «Файл» содержит название файла, его размер и тип информации (Текст, изображение, аудио, видео.
Рекомендую задать типы информации через Enum).
Реализуйте механизм поиска по файлам. Метод, реализующий поиск должен выбрасывать FileNotFoundException,
если файл не найден (вне зависимости от варианта задачи). Если файл с названием, введенным пользователем с клавиатуры,
существует – вывести на экран информацию о нем (допустимо использовать переопределенный toString()). Если нет, то

Вариант 1: выведите сообщение «Искомый файл не существует»;

Вариант 2: выбросьте исключение FileNotFoundException. Подсказка: throws можно использовать в том числе в main().*/

import com.walking.lesson20_exeption.task1_catchExeption.model.MediaType;
import com.walking.lesson20_exeption.task1_catchExeption.model.File;
import com.walking.lesson20_exeption.task1_catchExeption.service.FileService;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FileService fileService = new FileService();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a file name: ");
        String fileName = sc.nextLine();
        sc.close();
        try {
            File[] allFiles = initFiles();
            File foundFile = fileService.findFile(fileName, allFiles);
        } catch (FileNotFoundException e) {
            System.out.println("File not exists");
        }
    }

    private static File[] initFiles() {
        File file1 = new File("1.txt", 1234, MediaType.TEXT);
        File file2 = new File("2.txt", 34567, MediaType.TEXT);
        File file3 = new File("3.txt", 34567, MediaType.TEXT);
        File file4 = new File("4.png", 123456782, MediaType.IMAGE);
        File file5 = new File("5.jpg", 123456782, MediaType.IMAGE);
        File file6 = new File("6.mp3", 123456782, MediaType.AUDIO);
        File file7 = new File("7.wav", 234567876543L, MediaType.AUDIO);
        File file8 = new File("8.mp4", 234567876543L, MediaType.VIDEO);
        File file9 = new File("9.avi", 234567876543L, MediaType.VIDEO);
        File file10 = new File("10.mkv", 234567876543L, MediaType.VIDEO);

        return new File[]{file1, file2, file3, file4, file5, file6, file7, file8, file9, file10};
    }
}
