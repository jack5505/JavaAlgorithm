package com.company.core;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class Box<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
    public <U extends Number> void inspect(U u){
        System.out.println("T: " + t.getClass().getName());
        System.out.println("U: " + u.getClass().getName());
    }

    public static <T extends Comparable<T>> int  countGreater(T[] anArray, T element){
        int count = 0;
        for(T i : anArray){
            if(i.compareTo(element) > 0){
                count++;
            }
        }
        return count;
    }
    public static void calculate(Number number){

    }

    public static void test(List<? extends Number> shrt){

    }

    public static void add(List<? super Integer> list){

    }



    public static void main(String[] args) {
        List<Integer> show = new ArrayList<>();
        List<Integer> show1 = new ArrayList<>();
        add(show);
        test(show);
        Box<Integer> test = new Box<>();
        test.setT(5);

        Integer a[] = new Integer[10];
        for(int i = 0 ; i < 10; i++){
            a[i] = i;
        }
        System.out.println(countGreater(a,3));
        String tt[] = new String[10];
        String temp = "";
        for(int i = 0 ;i < 10 ;i ++){
            tt[i] = temp;
            temp += i + "";
        }
        System.out.println(countGreater(tt,"012"));
        calculate(32);
        calculate(BigDecimal.valueOf(32));

    }
    //Multiple Bounds
    //The preceding example illustrates the use of a type parameter with a single bound, but a type parameter can have multiple bounds:
    //
    //<T extends B1 & B2 & B3>
    //A type variable with multiple bounds is a subtype of all the types listed in the bound. If one of the bounds is a class, it must be specified first. For example:
    //
    //Class A { /* ... */ }
    //interface B { /* ... */ }
    //interface C { /* ... */ }
    //
    //class D <T extends A & B & C> { /* ... */ }
}
