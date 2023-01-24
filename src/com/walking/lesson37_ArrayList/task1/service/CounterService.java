package com.walking.lesson37_ArrayList.task1.service;
 /* Также реализовать сервис CounterService, зона ответственности которого —
 хранение массива доступных счетчиков, получение всех доступных счетчиков,
 получение доступа к счетчику по названию,
 увеличение значения счетчика на единицу или заданное значение,
 а также сброс счетчика до нулевого значения.

 Рекомендую максимально расширить функциональность сервиса
(не в ущерб здравому смыслу), чтобы посмотреть в работе как можно большее количество методов списка. */

import com.walking.lesson37_ArrayList.task1.model.Counter;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

public class CounterService {
    //    обратите внимание, поле финализировано. Мы можем изменять содержимое списка,
//    но в рамках логики сервиса ссылка на объект списка изменяться не должна
    private final List<Counter> counters;

    public CounterService(List<Counter> counters) {
//        Создаем копию списка, переданного параметром. Далеко не всегда в этом есть необходимость,
//        но такое решение имеет право на жизнь, если дальнейшая судьба исходного списка неизвестна
        this.counters = new ArrayList<>(counters);
    }

    public Counter addCounter(Counter counter) {
        counters.add(counter);
        return counter;
    }

    public List <Counter> getAllCounters() {
        return counters;
    }

    public Counter getCounterByName(String str) {
        for (Counter counter : counters) {
            if (counter.getName().equals(str)) {
                return counter;
            }
        }
        return null;
    }

    public Counter increaseCounter(String str, int value) {
        Counter counter = getCounterByName(str);
        if (counter == null) {
            return null;
        }
        return increaseCounter(counter, value);
    }

    public Counter increaseCounter(Counter counter, int value) {
        counter.setValue(counter.getValue() + value);
        return counter;
    }

    public Counter decreaseCounter(String str, int value) {
        Counter counter = getCounterByName(str);
        if (counter == null) {
            return null;
        }
        return increaseCounter(counter, value);
    }

    public Counter decreaseCounter(Counter counter, int value){
        counter.setValue(counter.getValue()-value);
        return counter;
    }
    public Counter incrementCounter(String name) {
        Counter counter = getCounterByName(name);

        if (counter == null) {
            return null;
        }

        return incrementCounter(counter);
    }

    public Counter incrementCounter(Counter counter) {
        increaseCounter(counter, 1);

        return counter;
    }

    public Counter decrementCounter(String name) {
        Counter counter = getCounterByName(name);

        if (counter == null) {
            return null;
        }

        return decrementCounter(counter);
    }

    public Counter decrementCounter(Counter counter) {
        decreaseCounter(counter, 1);

        return counter;
    }

    public Counter reset(String name) {
        Counter counter = getCounterByName(name);

        if (counter == null) {
            return null;
        }

        return reset(counter);
    }

    public Counter reset(Counter counter) {
        counter.setValue(0);

        return counter;
    }
}
