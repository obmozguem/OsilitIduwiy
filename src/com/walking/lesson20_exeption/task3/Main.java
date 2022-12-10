package com.walking.lesson20_exeption.task3;

import com.walking.lesson20_exeption.task3.model.Animal;
import com.walking.lesson20_exeption.task3.model.Cat;
import com.walking.lesson20_exeption.task3.model.Cow;
import com.walking.lesson20_exeption.task3.model.Dog;

/*Реализуйте любой из вариантов задачи в уроке 18. Для ситуации, когда тип животного неизвестен, выбрасывайте
собственное исключение UnknownAnimalException. Предка исключения определите самостоятельно.
Также предусмотрите валидацию массива животных на содержание пустых элементов. Если таковые существуют –
 бросьте кастомное исключение ArrayValidationException, которое содержит информацию об индексе массива,
  содержащем содержит null.
 */
public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{new Cat(), new Dog(), new Cow()};

        soundAll(animals);
    }

    private static void soundAll(Animal[] animals) {
        for (int i =0; i<animals.length; i++) {
            if (animals[i] == null) {
                throw new ArrayValidationException(i);
            }
            sound(animals[i]);
        }
    }

    private static void sound(Animal animal) {
        if (animal.getClass().equals(Cat.class)) {
            ((Cat) animal).meow();
        } else if (animal.getClass().equals(Dog.class)) {
            ((Dog) animal).woof();
        } else if (animal.getClass().equals(Cow.class)) {
            ((Cow) animal).moo();
        } else {
            throw new UnknownAnimalException("Unknown animal");
        }
    }

}
