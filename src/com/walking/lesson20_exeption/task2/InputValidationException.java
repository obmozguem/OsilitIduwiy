package com.walking.lesson20_exeption.task2;

public class InputValidationException extends RuntimeException{
    public InputValidationException(String message) {
        super(message);
    }
}
