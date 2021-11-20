package com.company.generics;

/**
 * @author Sabirov Jakhongir
 */
public class Test {
    public static void main(String[] args) {
       CountMap<Integer> countMap = new CountMapImpl<>();
       countMap.add(1);
       countMap.add(3);
       countMap.add(2);
       countMap.add(2);
       countMap.add(3);
       countMap.add(2);

       if(countMap.getCount(1) == 1){
           System.out.println("YES");
       }
       if(countMap.getCount(3) == 2){
           System.out.println("YES");
       }
       if(countMap.getCount(2) == 3){
           System.out.println("YES");
       }
    }
}
