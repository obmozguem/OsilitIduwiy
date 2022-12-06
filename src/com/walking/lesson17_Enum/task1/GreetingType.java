package com.walking.lesson17_Enum.task1;

public enum GreetingType {
    HI("Hi", "Hello"),
    BYE("Bye", "Good bye"),
    HOW_ARE_YOU("How are you", "How are your doing");
    private final String greeting;
    private final String answer;

    GreetingType(String greeting, String answer) {
        this.greeting = greeting;
        this.answer = answer;
    }

    public static void findGreetingType(String greeting) {
        //Если параметр == null, возвращаем неизвестное сообщение, иначе при вызове equals()
        // в цикле будет вызвано исключение
        //if (greeting == null) {
        //  System.out.println("Unknown message");
        //}
        for (GreetingType greetingtype : GreetingType.values()) {
            if (greeting.equals(greetingtype.greeting)) {
                System.out.println(greetingtype.answer);
            }
        }
    }
}

