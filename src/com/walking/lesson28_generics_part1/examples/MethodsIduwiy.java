package com.walking.lesson28_generics_part1.examples;

public class MethodsIduwiy {

    // Пример работы с параметризованным параметром метода, при наличии других параметров
    private <T> String getStringValue(T param, String prefix) {
        return prefix + param.toString();
    }

    // Пример использования ограничения типа при параметризации метода
    private <T extends Number> String getDoubleStringValue(T param) {
        return String.valueOf(param.doubleValue());
    }

    // Возвращение параметризованного типа из метода
    private <T> T doSth(T param) {
        //какая-то логика обработки параметра
        return param;//или другой объект того же типа
    }
}

