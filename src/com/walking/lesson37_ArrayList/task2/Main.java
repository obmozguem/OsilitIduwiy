package com.walking.lesson37_ArrayList.task2;

/* Попробуйте реализовать собственную коллекцию, наследуясь от Collection. За основу можно взять задачу 4 из урока 28.
Если возникнет необходимость в имплементации методов, не рассмотренных в статье - можете реализовать их как заглушки
(возвращая null/фиксированное значение по умолчанию/бросая исключение).
 */

import com.walking.lesson37_ArrayList.task2.collection.SinglyLinkedList;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> testIntList = createTestIntList();
        System.out.println(testIntList.size());
        System.out.println(testIntList.getTop());

        testIntList.remove(1);
        testIntList.add(8);
        testIntList.add(9);

        System.out.println(testIntList.size());
        System.out.println(testIntList.getTop());

        testIntList.retainAll(List.of(1, 2, 3, 4));
        System.out.println(testIntList.size());
    }

    private static SinglyLinkedList<Integer> createTestIntList() {
//        Вообще, использовать при объявлении переменной реализацию, а не интерфейс - плохая практика,
//        но в Collection нет методов для получения элементов, а реализовывать интерфейсы-наследники Collection -
//        переусложнение задания
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        return list;
    }
}