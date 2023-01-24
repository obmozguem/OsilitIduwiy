package com.walking.lesson30_regex.task3;

import com.walking.lesson30_regex.task2.exeption.RegexValidationException;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/* Реализуйте задачу Лессон26-таск2: "Реализуйте программу, принимающую с клавиатуры строку, содержащую слова, разделенные пробелом. Выведите в консоль
количество уникальных слов в строке. Учтите, что строка может начинаться с пробела.
Для упрощения допустим, что в строке не могут использоваться символы, отличные от пробела или русских/английский букв.
 Помните, что слово может быть введено в разных регистрах."

 Теперь слова в исходном массиве могут быть разделены несколькими пробелами, а также знаками табуляции и иными
 пробельными символами. Словами считаются лишь подстроки, состоящие из буквенных символов или содержащие в середине
 слова один или несколько дефисов, но не более одного подряд. При наличии в исходной строке невалидных символов или
 некорректном использовании допустимых, должно быть выброшено исключение.
 */
public class Main {
    public static final String WORDS_REGEX = "[a-z-\s]+";
    public static final String WORD_REGEX = "[a-z][a-z-]+[a-z]";
    public static final String SIMPLE_WORD_REGEX = "[a-z]+";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter words: ");
        String words = sc.nextLine().trim().toLowerCase();
        sc.close();
        validateWords(words);
        String[] wordsArray = words.split("\s+");
        int counter = countUniqueWords(wordsArray);
        System.out.printf("Found %d unique wors \n", counter);
        /*  String[] array = "asdj--dvf-df---dff--d-ffv-fgdf-kp".split("-");
        System.out.println(Arrays.toString(array));
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[1]=="");  */
    }

    private static int countUniqueWords(String[] wordsArray) {
        int counter = 0;
        for (int i = 0; i < wordsArray.length; i++) {
            validateWord(wordsArray[i]);
            boolean isUnique = true;
            int j = 0;
            while (isUnique && j < i) {
                if (wordsArray[i].equals(wordsArray[j])) {
                    isUnique = false;
                } else {
                    j++;
                }
            }
            if (isUnique) {
                counter++;
            }
        }
        return counter;
    }

    private static void validateWords(String words) {
        if (!words.matches(WORDS_REGEX)) {
            throw new RegexValidationException(words, WORDS_REGEX);
        }
    }

    private static void validateWord(String word) {
        if (word.contains("-")) {
            if (!word.matches(WORD_REGEX)) {
                throw new RegexValidationException(word, WORD_REGEX);
            } else {
                String[] subString = word.split("-");
                for (int i = 0; i < subString.length; i++) {
                    if (subString[i].equals("")) {
                        throw new RuntimeException("Invalid input. Should not be more than one \"-\" in a row");
                    }
                }
            }
        } else {
            validateSimpleWord(word);
        }
    }

    private static void validateSimpleWord(String simpleWord) {
        if (!simpleWord.matches(SIMPLE_WORD_REGEX)) {
            throw new RegexValidationException(simpleWord, SIMPLE_WORD_REGEX);
        }
    }
}
