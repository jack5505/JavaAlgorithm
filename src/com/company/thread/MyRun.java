package com.company.thread;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class MyRun implements java.lang.Runnable {
    NotThreadSafe instance = null;

    public MyRun(NotThreadSafe instance) {
        this.instance = instance;
    }

    @Override public void run() {
        System.out.println("some text " + instance.builder.toString());
    }
}
