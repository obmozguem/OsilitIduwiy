package com.walking.lesson30_regex.task3.exception;

public class RegexInvalidException extends RuntimeException {
    RegexInvalidException (String st, String regex){
        super("%s is not matches %s".formatted(st, regex));
    }
}
