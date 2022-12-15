package com.walking.lesson28_generics_part1.task1;

/* Создать обобщенный тип, принимающий в себя любого из наследников Number. Создать метод, возводящий значение
параметризованного типа в степень, переданную параметром в метод.
 */

public class Main {
    public static void main(String[] args) {
        Generic1<Integer> gen1 = new Generic1<>(34);
        double b = gen1.degree(2.0);
        System.out.println(b);
    }
}

class Generic1<T extends Number> {
    private T field;

    public T getField() {
        return field;
    }

    public Generic1(T field) {
        this.field = field;
    }

    public <T> double degree(double x) {
        return Math.pow((double) (int) field, x);
    }
}


