package com.walking.lesson28_generics_part1.task3;

/* Реализовать класс для работы с массивом. Разработать метод, производящий поиск значения в массиве. Если значение не
найдено — выбрасывать исключение. Если найдено — возвращать его.
 */
public class Main {
    public static void main(String[] args) {
        Integer [] array = {2, 4,7,3,6,8,54};
        Integer value = 3;
        Generic <Integer> genInt = new Generic<>(array, value);
        Integer result = genInt.searchElement();
        System.out.println(result);
    }
}

class Generic<T> {
    private T[] array;
    private T value;

    public Generic(T[] array, T controlWord) {
        this.array = array;
        this.value = controlWord;
    }

    public T[] getArray() {
        return array;
    }

    public T getValue() {
        return value;
    }

    public <T> T searchElement() {
        for (int i = 0; i < array.length; i++) {
            if (value.equals(array[i])) {
                return (T) value;
            }
        }
        throw new RuntimeException("Array does not contain this value");
    }
}

