package com.walking.lesson26_StringBuilder.task2;

/*Реализуйте программу, принимающую с клавиатуры строку, содержащую слова, разделенные пробелом. Выведите в консоль
количество уникальных слов в строке. Учтите, что строка может начинаться с пробела.
Для упрощения допустим, что в строке не могут использоваться символы, отличные от пробела или русских/английский букв.
 Помните, что слово может быть введено в разных регистрах.
 */

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter words: ");
        String st = sc.nextLine();
        sc.close();
        String words[] = st.strip().toLowerCase().split(" ");
        /*System.out.println(Arrays.toString(words));
        int counter = 1;
        String controlWord;
        StringBuilder sb = new StringBuilder();
        OUTER:
        for (int i = 1; i < words.length; i++) {
            controlWord = words[i];
            INNER:
            for (int j = 0; j < i; j++) {
                if (controlWord.equals(words[j])) {
                    continue OUTER;
                }
            }
            counter++;
        }*/
        int counter = 0;
        for (int i = 0; i < words.length; i++) {
            // Каждое слово в массиве сравниваем с предыдущими словами того же массива.
            // Если слово эквивалентно одному из предыдущих - оно не уникально
            int j = 0;
            boolean isUnique = true;
            while (j < i && isUnique) {
                if (words[i].equals(words[j])) {
                    isUnique = false;
                } else {
                    j++;
                }
            }

            if (isUnique) {
                counter++;
            }
        }

        System.out.printf("Found %d unique words\n", counter);
    }
}
