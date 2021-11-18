package com.company.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class Problems {

    static public <T> int cnt(List<T> list){
        int cnt = 0;
        for(T i : list){
           Number test = (Number) i;
           if(test.intValue() % 2  == 0){
               cnt ++;
           }
        }
        return cnt;
    }

    static public <T> T[] change(T[] a,T pos, T pos2){
       T temp  = a[(Integer) pos];
       T temp1 = a[(Integer) pos2];
       a[(Integer) pos]  = temp1;
       a[(Integer) pos2] = temp;
       return a;
    }

    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        list.add(3.0);
        list.add(5.0);
        list.add(8.0);
        list.add(123.31);
        list.add(124.31);
        //System.out.println(cnt(list));
        Integer[]  a = {2,1,5,3,1};
        double[] b = {2,1,5,3,1};
        a = change(a,0,4);
        for(int i = 0 ; i < a.length ; i ++){
            System.out.print(a[i] + " ");
        }


    }
}
