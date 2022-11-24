package Nov23_Incapsulation;
/*Ответственность класса, содержащего main() — создание счетчиков. Сам класс также предлагаю назвать Main.
Также реализовать в классе Main приватный метод, который позволяет вывести значения счетчиков в виде:
<Название счетчика>: <Значение счетчика>. Например:
Газ: 2333
Горячая вода: 0
Холодная вода: 23
*/

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Counters count1 = new Counters("Газ", "метр кубический", 20);
        Counters count2 = new Counters("Холодная вода", "метр кубический", 15);
        Counters count3 = new Counters("Горячая вода", "метр кубический", 5);
        Counters count4 = new Counters("Electricity", "киловатт", 50);
        Counters[] array = {count1, count2, count3, count4};
        ShowInfo(array);
        //CounterService cs = new CounterService();
        //Counters coun = cs.searchByName("апр", array);
        //System.out.println(coun);
    }

    private static void ShowInfo(Counters... array) {
        for (Counters counters : array)
            System.out.println(counters.getName() + ": " + counters.getCounter());
    }
}
