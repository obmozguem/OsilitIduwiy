package com.walking.lesson29_generics_part2.task1;

/* Реализуйте обобщенный тип, хранящий параметризованное поле. Также в классе Main реализуйте параметризованый метод,
принимает первым параметром объект вашего дженерика, вторым — объект типа, которым параметризован объект первого
параметра. Метод должен возвращать значение поля дженерика, если оно != null, в противном случае — возвращать
второй параметр.
 */

public class Main {
   private  <T> T doSth (Generic gen, T value){
       if(gen.getField()!=null){
           return (T) gen.getField();
       }
       else {
           return value;
       }
   }

    public static void main(String[] args) {
        Generic <String> gen1 = new Generic<>();
        gen1.setField(null);
        Main main = new Main();
        String result = main.doSth(gen1,"Ole4ka");
        System.out.println(result);
    }
}
class Generic <T> {
    private T field;

    public T getField() {
        return field;
    }

    public void setField(T field) {
        this.field = field;
    }
}
