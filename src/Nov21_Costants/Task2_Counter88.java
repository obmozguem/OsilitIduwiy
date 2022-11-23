package Nov21_Costants;

/*public class Count {
    public String name;
    public int counter;

    public Count(String name) {
        this(name, 0);
    }.....
реализуйте неизменность поля названия у класса Counter. Ведь очень странно, если мы можем менять название счетчика
 по ходу выполнения программы, не так ли?
 ДОДЕЛАТЬ!
*/
public class Task2_Counter88 {
    public static final String NAME = "SomeName";
    public int counter;

    public Task2_Counter88(String name) {
        this(name, 0);
    }

    public Task2_Counter88(String name, int counter) {
        this.counter = counter;
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

