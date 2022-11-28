package com.walking.lesson12_Incapsulation;

import java.util.Arrays;
/*Также реализовать сервис CounterService, зона ответственности которого — хранение массива доступных счетчиков,
получение всех доступных счетчиков, получение доступа к счетчику по названию, увеличение значения счетчика на
единицу или заданное значение, а также сброс счетчика до нулевого значения.*/

public class CounterService {
    private Counter[] counters;

    //    Для большей наглядности кодовой базы, примем, что проверка на null для входных значений -
   // ответственность вышестоящих сервисов
    public CounterService(Counter... counters) {
        this.counters = counters;
    }

    public Counter addCounter(Counter counter) {
        int newArrayLength = counters.length + 1;

        Counter[] newCounters = new Counter[newArrayLength];
        newCounters[newArrayLength - 1] = counter;

        counters = copyArray(counters, newCounters);

        return counters[counters.length - 1];
    }

    public Counter[] getAllCounters() {
        return counters;
    }

//    Возвращаем счетчик из метода на случай, если необходимо продолжить работу с ним.
//    В рамках текущей задачи мы не изменяем ссылку на счетчик. Но если бы вместо массива была БД -
//    ссылка на объект могла бы измениться. Возврат значения для сервисов, обрабатывающих сущности -
//    хорошая практика.

    public void arrayCounters(Counter... array) {
        System.out.println(Arrays.toString(array));
    }

    public void increase(Counter count, int value) {
        int newCount = count.getCounter() + value;
        count.setCounter(newCount);
    }

    public void increment(Counter count) {
        int newCount = count.getCounter() + 1;
        count.setCounter(newCount);
    }

    public void zeroing(Counter count) {
        count.setCounter(0);
    }

    public Counter searchByName(String st, Counter... array) {
        for (Counter counter : array) {
            if (counter.getName().equals(st)) {
                return counter;
            }
        }
        return null;
    }

    //System.arraycopy - более оптимальное решение. Однако целью было продемонстрировать,
   //    как можно копировать массивы вручную, а также продемонстрировать использование
   //    приватных методов. Т.к. копирование массива - логически самостоятельная операция,
   //    некрасиво было бы оставлять ее в методе addCounter().
   //    К тому же, этот метод может быть переиспользован в дальнейшем
    private Counter[] copyArray(Counter[] oldArray, Counter[] newArray) {
        for (int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];
        }

        return newArray;
    }
}
// сделать НОРМАЛЬНЫЕ методы: хранение массива доступных счетчиков,
//получение всех доступных счетчиков,