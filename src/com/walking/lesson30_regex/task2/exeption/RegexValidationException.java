package com.walking.lesson30_regex.task2.exeption;

public class RegexValidationException extends RuntimeException {
    public RegexValidationException (String str, String regex){
        super("%s is not matches %s".formatted(str, regex));
    }
}
