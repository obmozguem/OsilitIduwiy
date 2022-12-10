package com.walking.lesson20_exeption.task1_throwsExeprtion;

import com.walking.lesson20_exeption.task1_throwsExeprtion.model.File;
import com.walking.lesson20_exeption.task1_throwsExeprtion.model.MediaType;
import com.walking.lesson20_exeption.task1_throwsExeprtion.service.FileService;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        FileService fileService = new FileService();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a file name: ");
        String fileName = sc.nextLine();
        sc.close();
        File[] allFiles = initFiles();
        File foundFile = fileService.findFile(fileName, allFiles);
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
