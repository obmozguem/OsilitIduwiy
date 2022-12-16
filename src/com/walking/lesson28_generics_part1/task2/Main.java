package com.walking.lesson28_generics_part1.task2;

//Создать класс-обертку над объектом любого типа. Предусмотреть boolean-метод, проверяющий значение объекта на null.

public class Main {
    public static void main(String[] args) {
        Generic<String> gen = new Generic<>(null);
        boolean b = gen.isNull();
        showAnswer(b);
    }

    public static void showAnswer(boolean b) {
        if (b) {
            System.out.println("Object is null");
        } else {
            System.out.println("Object is not null");
        }
    }
}

class Generic<T> {
    private T field;

    public Generic(T field) {
        this.field = field;
    }

    public T getField() {
        return field;
    }

    public void setField(T field) {
        this.field = field;
    }

    public boolean isNull() {
        if (field==null) {
            throw new NullPointerException("Object is null");
        } else {
            return false;
        }
    }
}
