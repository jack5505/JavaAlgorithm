package com.company.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sabirov Jakhongir
 */
public class Learn {
    public static void main(String[] args) {
        // Generic will happen in java 5
        // sut generiqov yesli qod qompliruyetsa v rontayme ne doljno bit exceptions
        List<Integer> list =  createElements();
        printall(list);
    }

    // List<? extends Number> eto tolqo dlya chteniya bezopasno

    private static void printall(List<? extends Number> list) {
        // list.add(15); wront dobavit tut u nas ne poluchetsya
        for(Number i : list){
            System.out.println(i);
        }
        
    }

    private static List createElements(){
        List list = new ArrayList();
        list.add("1");
        list.add(1);
        list.add(1L);
        return list;
    }
}
