package com.company.generics;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author Sabirov Jakhongir
 */
public class CollectionsUtils {

    public static<E> E max(List<E> list, Comparator<E> comparator){
      E max = list.get(0);
      for(E e : list){
          // yesli perviy parameter menshi chem vtoroy e togda vozvrashayetsa chislo menshi nulya
          if(comparator.compare(max,e) < 0){
              max = e;
          }
      }
      return max;
    }

    public static void main(String[] args) {
         List<Integer> list = Arrays.asList(15,25,789798);
         Integer m =  max(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }
        });
        System.out.println(m);
    }
}
