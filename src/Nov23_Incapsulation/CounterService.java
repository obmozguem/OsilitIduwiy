package Nov23_Incapsulation;
import java.util.Arrays;
/*Также реализовать сервис CounterService, зона ответственности которого — хранение массива доступных счетчиков,
получение всех доступных счетчиков, получение доступа к счетчику по названию, увеличение значения счетчика на
единицу или заданное значение, а также сброс счетчика до нулевого значения.*/

 public class CounterService {
    public void arrayCounters (Counters... array){
        System.out.println(Arrays.toString(array));
    }
    public int increase(Counters, int value) {


    }
}
