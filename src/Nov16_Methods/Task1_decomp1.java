package Nov16_Methods;

import java.util.Scanner;

/*Декомпозировать задачу Nov12_ConditionalConstructs/Task2_Hi ( Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        switch (st) {
            case "Hi":
                System.out.println("Hello");
                break;
            case "Bye":
                System.out.println("Good Bye");
                break;
            default:
                System.out.println("Unknown message");).
Вынести в отдельный метод использование switch-case.
Также вынести в отдельный метод использование  System.out.println
 */
public class Task1_decomp1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter string: ");
        String greeting = scanner.nextLine();

        scanner.close();

        printAnswer(greeting);

    }

    static void printAnswer(String greeting) {
        String answer;

        switch (greeting) {
            case "Hi":
                answer = "Hello";
                break;

            case "Bye":
                answer = "Good bye";
                break;

            case "How are you":
                answer = "How are your doing";
                break;

            default:
                answer = "Unknown message";
        }

        log(answer);
    }

    static void log(String message) {
        System.out.println(message);
    }
}
