package com.walking.lesson30_regex.task2;

/*Реализуйте метод для работы с ФИО. Входным параметром должна являться строка, содержащая русскоязычное ФИО. Фамилия,
имя и отчество должны начинаться с прописной буквы и быть разделены пробелами. Фамилия может быть двойной и писаться
через дефис (каждая часть фамилии начинается с прописной буквы). Если строка валидна – верните ФИО, обернутое в класс
«Полное имя», содержащий фамилию, имя и отчество. Если невалидна – бросьте из метода исключение, указывающее на ошибку
валидации.
 */

import com.walking.lesson30_regex.task2.exeption.RegexValidationException;
import com.walking.lesson30_regex.task2.model.FullName;

public class Main {
    public static final String FULL_NAME_REGEX = "^[А-Я][а-яА-Я-]* [А-Я][а-я]* [А-Я][а-я]+$";
    public static final String DOUBLE_SURNAME_REGEX = "[А-Я][а-я]*-[А-Я][а-я]*";
    public static final String NAME_REGEX = "[А-Я][а-я]*";
    public static final String PATRONYMIC_REGEX = "[А-Я][а-я]*";

    public static void main(String[] args) {
        System.out.println(parseName("Иванов Иван Иванович"));
        System.out.println(parseName("Иванов-Иванов Иван Иванович"));
        System.out.println(parseName("Иванов-Иванов И Иванович"));
        System.out.println(parseName("И-Иванов И Иванович"));
        System.out.println(parseName("Иванов иван Иванович"));
//        Все равно упадет на 24й строке.
//        System.out.println(parseName("И-иванов И Иванович"));
//        System.out.println(parseName("Иванов Иван иванович"));
//        System.out.println(parseName("ИваНов Иван Иванович"));
//        System.out.println(parseName("Ivanov Ivan"));
    }

    public static FullName parseName(String str) {
        if (!str.matches(FULL_NAME_REGEX)) {
            throw new RegexValidationException(str, FULL_NAME_REGEX);
        }
        FullName fullName = new FullName();
        String splitArray[] = str.split(" ");

        String surname = splitArray[0];
        validateSurname(surname);
        fullName.setSurname(surname);

        String name = splitArray[1];
        validateName(name);
        fullName.setName(name);

        String patronymic = splitArray[2];
        validatePatronymic(patronymic);
        fullName.setPatronymic(patronymic);

        return fullName;
    }

    public static void validateSurname(String str) {
        if (str.contains("-")) {
            if (!str.matches(DOUBLE_SURNAME_REGEX)) {
                throw new RegexValidationException(str, DOUBLE_SURNAME_REGEX);
            }
        } else {
            validateName(str);
        }

    }

    public static void validateName(String str) {
        if (!str.matches(NAME_REGEX)) {
            throw new RegexValidationException(str, NAME_REGEX);
        }
    }

    public static void validatePatronymic(String str) {
        if (!str.matches(PATRONYMIC_REGEX)) {
            throw new RegexValidationException(str, PATRONYMIC_REGEX);
        }
    }
}
