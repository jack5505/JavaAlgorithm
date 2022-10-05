package com.company.thread;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class Threading {
    public static void main(String[] args) throws InterruptedException {

        long start = System.currentTimeMillis();
        List<String> list = Collections.synchronizedList(new ArrayList<>());
        Thread uzcard  = new Thread(){
            @Override public void run() {
                for(int i = 1 ; i <= 5000 ;i ++){
                    //System.out.println(i + "");
                    list.add(i + "uzcard");
                }
            }
        };

        Thread gl = new Thread(){
            @Override public void run() {
                for(int i = 1; i <= 10000; i ++){
                   // System.out.println("humo " + i);
                    list.add("humo " + i);
                }
            }
        };
        uzcard.start();
        gl.start();
        uzcard.join();
        gl.join();
        long end = System.currentTimeMillis();
        // System.out.println(Duration.between(start,end).toNanos());
        System.out.println(end - start);

    }
}
