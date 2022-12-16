package com.walking.lesson29_generics_part2.task2;

/* Используя Задачу 1 из урока 28, реализуйте в Main метод, принимающий аргументом объект подходящего
 для дженерика типа и возвращающий объект дженерика. Допустима параметризация только с использованием wildcard.

 Задача: Создать обобщенный тип, принимающий в себя любого из наследников Number. Создать метод, возводящий значение
параметризованного типа в степень, переданную параметром в метод.
 */

public class Main {
public <T> T doSth (GenericNumb genNumb){
    return (T) genNumb;
}
}
class GenericNumb <T extends Number>{
    private T field;

    public T getField() {
        return field;
    }

    public void setField(T field) {
        this.field = field;
    }
    public <T> double degree(double x) {
        return Math.pow((double) (int) field, x);
    }
}
// ГДЕ ИСПОЛЬЗОВАТЬ ВАИЛДКАРТ?....(( СВЕРИТЬ