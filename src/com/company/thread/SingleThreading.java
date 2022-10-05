package com.company.thread;

import java.util.ArrayList;
import java.util.List;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class SingleThreading {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        List<String> list = new ArrayList<>();
        for(int i = 0 ; i < 5000;i ++){
            list.add(i + "uzcard");
        }

        for(int i = 1; i <= 10000; i ++){
            // System.out.println("humo " + i);
            list.add("humo " + i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
