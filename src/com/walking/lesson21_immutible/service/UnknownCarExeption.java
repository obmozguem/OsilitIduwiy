package com.walking.lesson21_immutible.service;

public class UnknownCarExeption extends RuntimeException{
    public UnknownCarExeption(String message) {
        super(message);
    }
}
