package Nov23_Incapsulation;/*Разработать программу в рамках компании com.walking, позволяющую следить за счетчиками на
газ, холодную воду, горячую воду и электричество. Обозначение программы в рамках компании — counterAggregation.
Используя за основу задачу, реализовать класс счетчика, который хранит название счетчика и его значение, его единицы
измерения, а также обеспечивает доступ к значениям. Название счетчика и его единицы измерения должны быть неизменны.
Также реализовать сервис CounterService, зона ответственности которого — хранение массива доступных счетчиков,
получение всех доступных счетчиков, получение доступа к счетчику по названию, увеличение значения счетчика на
единицу или заданное значение, а также сброс счетчика до нулевого значения.
Ответственность класса, содержащего main() — создание счетчиков. Сам класс также предлагаю назвать Main.
Также реализовать в классе Main приватный метод, который позволяет вывести значения счетчиков в виде:
<Название счетчика>: <Значение счетчика>. Например:
Газ: 2333
Горячая вода: 0
Холодная вода: 23
public class Counter {
    public String name;
    public int counter;

    public Counter(String name) {
        this(name, 0);
    }

    public Counter(String name, int counter) {
        this.counter = counter;
        this.name = name;
    }

    public int increase(int value) {
        counter += value;

        return counter;
    }

    public int decrease(int value) {
        counter -= value;

        return counter;
    }

    public int increment() {
        return ++counter;
    }

    public int decrement() {
        return --counter;
    }
}
*/

public class Counter {
    public String name;
    public int counter;

    public Counter(String name) {
        this(name, 0);
    }

    public Counter(String name, int counter) {
        this.counter = counter;
        this.name = name;
    }

    public int increase(int value) {
        counter += value;

        return counter;
    }

    public int decrease(int value) {
        counter -= value;

        return counter;
    }

    public int increment() {
        return ++counter;
    }

    public int decrement() {
        return --counter;
    }

}
