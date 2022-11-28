package com.walking.lesson12_Incapsulation;
/*Ответственность класса, содержащего main() — создание счетчиков. Сам класс также предлагаю назвать Main.
Также реализовать в классе Main приватный метод, который позволяет вывести значения счетчиков в виде:
<Название счетчика>: <Значение счетчика>. Например:
Газ: 2333
Горячая вода: 0
Холодная вода: 23
*/

public class Main {
    public static void main(String[] args) {
        Counter count1 = new Counter("Газ", "метр кубический", 20);
        Counter count2 = new Counter("Холодная вода", "метр кубический", 15);
        Counter count3 = new Counter("Горячая вода", "метр кубический", 5);
        Counter count4 = new Counter("Electricity", "киловатт", 50);
        Counter[] array = {count1, count2, count3, count4};
        ShowInfo(array);
        //CounterService cs = new CounterService();
        //Counters coun = cs.searchByName("апр", array);
        //System.out.println(coun);
    }

    private static void ShowInfo(Counter... array) {
        for (Counter counter : array)
            System.out.println(counter.getName() + ": " + counter.getCounter());
    }
}
