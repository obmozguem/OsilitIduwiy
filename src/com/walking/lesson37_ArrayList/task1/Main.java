package com.walking.lesson37_ArrayList.task1;
/* Реализуйте задачу из урока 12, используя ArrayList. Рекомендую максимально расширить функциональность сервиса
(не в ущерб здравому смыслу), чтобы посмотреть в работе как можно большее количество методов списка.
Опциональное условие: замените ArrayList на Vector. Изменилось ли что-то в кодовой базе при использовании
списка другой реализации?

 Используя за основу задачу из темы про классы и объекты, реализовать класс счетчика, который хранит название счетчика
 и его значение, его единицы измерения, а также обеспечивает доступ к значениям. Название счетчика и его единицы
 измерения должны быть неизменны.

 Также реализовать сервис CounterService, зона ответственности которого —
 хранение массива доступных счетчиков, получение всех доступных счетчиков,
 получение доступа к счетчику по названию,
 увеличение значения счетчика на единицу или заданное значение,
 а также сброс счетчика до нулевого значения.

 Ответственность класса, содержащего main() — создание счетчиков.
 Сам класс также предлагаю назвать Main.

 Также реализовать в классе Main приватный метод,
 который позволяет вывести значения счетчиков в виде:
 <Название счетчика>: <Значение счетчика>.
*/

import com.walking.lesson37_ArrayList.task1.model.Counter;
import com.walking.lesson37_ArrayList.task1.service.CounterService;

import java.util.List;

public class Main {
    public static final String GAS_COUNTER_NAME = "Газ";
    public static final String COLD_WATER_COUNTER_NAME = "Холодная вода";
    public static final String HOT_WATER_COUNTER_NAME = "Горячая вода";
    public static final String ELECTRIC_COUNTER_NAME = "Электричество";

    public static final String M_3_UNIT = "м3";
    public static final String KW_H_UNIT = "кВт/ч";

    public static void main(String[] args) {
        Counter gasCounter = new Counter(GAS_COUNTER_NAME, M_3_UNIT);
        Counter coldWaterCounter = new Counter(COLD_WATER_COUNTER_NAME, M_3_UNIT);
        Counter hotWaterCounter = new Counter(HOT_WATER_COUNTER_NAME, M_3_UNIT);
        Counter electricCounter = new Counter(ELECTRIC_COUNTER_NAME, KW_H_UNIT);
        electricCounter.setValue(15);

        CounterService counterService = new CounterService(List.of(gasCounter, coldWaterCounter));
        counterService.addCounter(hotWaterCounter);
        counterService.addCounter(electricCounter);

        counterService.increaseCounter(COLD_WATER_COUNTER_NAME, 12);
        counterService.decreaseCounter(electricCounter, 2);

        printCounterValues(counterService.getAllCounters());
    }

    private static void printCounterValues(List<Counter> counters) {
        for (Counter counter : counters)
            System.out.printf("%s: %d\n", counter.getName(), counter.getValue());
    }

}
