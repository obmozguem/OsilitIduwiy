package com.walking.lesson20_exeption.task3;

public class UnknownAnimalException extends RuntimeException{
    UnknownAnimalException (String message) {
        super(message);
    }
}
