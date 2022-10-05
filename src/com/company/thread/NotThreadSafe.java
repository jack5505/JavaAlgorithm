package com.company.thread;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class NotThreadSafe {
    StringBuilder builder = new StringBuilder();

    public void add(String text){
        this.builder.append(text);
    }

}
