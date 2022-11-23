package Nov12_ConditionalConstructs;

import java.util.Scanner;

public class Task3_FIO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String surname = sc.nextLine();
        String name = sc.nextLine();
        String middleName = sc.nextLine();
        System.out.printf("Фамилия - %s, Имя -  %s, Отчество - %s", surname, name, middleName);
    }
}
