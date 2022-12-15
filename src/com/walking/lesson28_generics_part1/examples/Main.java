package com.walking.lesson28_generics_part1.examples;

public class Main {

    public static void main(String[] args) {
        Generic1<String> generic1St = new Generic1<>();//Создаем объект Generic1,T в этом экземпляре равносильно String
        generic1St.setField("1");
        Generic1<Integer> generic1Int = new Generic1<>();
        generic1Int.setField(25);
        // Создаем объект Generic1 без указания параметризации, T в этом экземпляре равносильно Object:
        Generic1 generic1Object = new Generic1();
        // Поскольку тип не указан явно, мы можем передавать все, что может быть приведено к ссылочному типу:
        generic1Object.setField("1");
        //Здесь работает принцип автоупаковки. Будет передан параметр типа Integer, а не int
        generic1Object.setField(1);

        Generic1 <String> generic2StrInt = new Generic2<>("jf", 23);
        System.out.println(generic2StrInt instanceof Generic1);       // Проверки инстансОф и гетКласс
        System.out.println(generic2StrInt.getClass().equals(Generic1.class));
    }
}

class Generic1<T> {
    private T field; //Поле типа Т

    public T getField() {   // геттер для поля failed
        return field;
    }

    public void setField(T field) {  // сеттер для поля failed
        this.field = field;
    }
}
class Generic2<T1, T2> extends Generic1{
    private T1 field1;
    private T2 field2;

    public Generic2(T1 field1, T2 field2) {
        this.field1 = field1;
        this.field2 = field2;
    }

    public T1 getField1() {
        return field1;
    }

    public void setField1(T1 field1) {
        this.field1 = field1;
    }
}
class Generic3 <T>{
    public static void showInfo (){
        System.out.println("its Generic3");
    }
}


