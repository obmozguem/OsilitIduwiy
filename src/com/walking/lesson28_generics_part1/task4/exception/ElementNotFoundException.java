package com.walking.lesson28_generics_part1.task4.exception;

public class ElementNotFoundException extends RuntimeException {
    public ElementNotFoundException() {
        super("Desired element not found");
    }
}
