package com.company.core;

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

    public static void main(String[] args) {
        Box<Integer> test = new Box<>();
        test.setT(5);

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
