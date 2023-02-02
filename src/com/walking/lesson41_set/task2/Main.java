package com.walking.lesson41_set.task2;

/* Реализуйте задачу 2 из урока 26, используя Set
 Задача: Реализуйте программу, принимающую с клавиатуры строку, содержащую слова, разделенные пробелом. Выведите в консоль
количество уникальных слов в строке. Учтите, что строка может начинаться с пробела.
Для упрощения допустим, что в строке не могут использоваться символы, отличные от пробела или русских/английский букв.
 Помните, что слово может быть введено в разных регистрах.
*/

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter words: ");
        String st = sc.nextLine();
        sc.close();

        String words[] = st.strip().toLowerCase().split(" ");

        Set <String> hashSet = new HashSet<>();
        Collections.addAll(hashSet, words);

        System.out.printf("Found %d unique words\n", hashSet.size());
    }


}
