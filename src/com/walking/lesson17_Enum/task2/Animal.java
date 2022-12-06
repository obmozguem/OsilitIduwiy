package com.walking.lesson17_Enum.task2;

public enum Animal {
    CAT {
        @Override
        public void sound() {
            System.out.println("meow");
        }
    },
    DOG {
        @Override
        public void sound() {
            System.out.println("woof");
        }
    },
    COW {
        @Override
        public void sound() {
            System.out.println("moo");
        }
    };

    public void sound() {
        System.out.println("Unknown animal");
    }

    public static void findAnimal(String someAnimal) {
        for (Animal animal : Animal.values()) {
            if (someAnimal.equals(animal.name())) {
                animal.sound();
            } else {
                System.out.println("Unknown animal");
            }
        }

        }
    }
/*DOG("woof"),
    CAT("meow"),
    COW("moo");

    private final String voice;

    AnimalType(String voice) {
        this.voice = voice;
    }

    public String getVoice() {
        return voice;
    }

    //    Следуем изначальному условию задачи, где указано, что метод должен выводить "голос" в консоль.
//    Само собой, в общем случае это не корректно и стоило бы возвращать из метода строку
    public void sound() {
        System.out.println(voice);*/
