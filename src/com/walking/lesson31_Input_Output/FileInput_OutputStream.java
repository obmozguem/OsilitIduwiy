package com.walking.lesson31_Input_Output;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInput_OutputStream {
    public static void main(String[] args) {

        try(FileInputStream fin=new FileInputStream("C://SomeDir//notes.txt");
            FileOutputStream fos=new FileOutputStream("C://SomeDir//notes_new.txt"))
        {
            byte[] buffer = new byte[fin.available()];
            // считываем буфер
            fin.read(buffer, 0, buffer.length);
            // записываем из буфера в файл
            fos.write(buffer, 0, buffer.length);
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
    /* В теле try  можно было считать и записать по байтам с помщью цикла вайл. Тело выглядело бы так:
    int i;
    while ((i=fin.read())!=-1) {
    fos.write(i);
     */
}
