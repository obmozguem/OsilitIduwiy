package com.walking.lesson20_exeption.task1_catchExeption.service;

import java.io.FileNotFoundException;
import com.walking.lesson20_exeption.task1_catchExeption.model.File;

public class FileService {
   /* private final File[] files;


    public FileService(File[] files) {
        this.files = files;
    }*/

    public File findFile(String fileName, File [] files) throws FileNotFoundException {
        for (File f : files) {
            if (fileName.equals(f.getName())) {
                return f;
            }
        }
        throw new FileNotFoundException("File not found");
    }
}
