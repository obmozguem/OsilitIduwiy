package com.walking.lesson28_generics_part1.examples;

public class Inteface1 {
    public static void main(String[] args) {

        Account2<String> acc1 = new Account2<String>("1235rwr", 5000);
        Account2<String> acc2 = new Account2<String>("2373", 4300);
        System.out.println(acc1.getId());
        System.out.println(acc2.getId());
    }
}
interface Accountable2<T>{
    T getId();
    int getSum();
    void setSum(int sum);
}
class Account2<T> implements Accountable2<T> {

    private T id;
    private int sum;

    Account2(T id, int sum){
        this.id = id;
        this.sum = sum;
    }

    public T getId() { return id; }
    public int getSum() { return sum; }
    public void setSum(int sum) { this.sum = sum; }
}
