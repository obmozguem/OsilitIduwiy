package Nov23_Incapsulation;

import java.util.Arrays;
/*Также реализовать сервис CounterService, зона ответственности которого — хранение массива доступных счетчиков,
получение всех доступных счетчиков, получение доступа к счетчику по названию, увеличение значения счетчика на
единицу или заданное значение, а также сброс счетчика до нулевого значения.*/

public class CounterService {
    public void arrayCounters(Counters... array) {
        System.out.println(Arrays.toString(array));
    }

    public void increase(Counters count, int value) {
        int newCount = count.getCounter() + value;
        count.setCounter(newCount);
    }

    public void increment(Counters count) {
        int newCount = count.getCounter() + 1;
        count.setCounter(newCount);
    }

    public void zeroing(Counters count) {
        count.setCounter(0);
    }

    public Counters searchByName(String st, Counters... array) {
        for (Counters counters : array) {
            if (counters.getName().equals(st)) {
                return counters;
            }
        }
        return null;
    }
}
