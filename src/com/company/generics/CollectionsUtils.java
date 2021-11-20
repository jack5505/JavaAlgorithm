package com.company.generics;

import java.util.ArrayList;
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

    // need to do extedn from Comparable and need to show up it is element in Comparable Interface
    public static<E extends Comparable<? super E>> E maxN(List<E> list){
        E max = list.get(0);
        for(E e : list){
            // yesli perviy parameter menshi chem vtoroy e togda vozvrashayetsa chislo menshi nulya
            if(max.compareTo(e) < 0){
                max = e;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        List<Person> list1 = Arrays.asList(
                new Person("Aaa",1),
                new Person("C",12),
                new Person("Bdd",10)
        );

        Person mx = max(list1, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int i = o1.getAge().compareTo(o2.getAge());
                if(i != 0) return i;
                return Integer.compare(o1.getAge(),o2.getAge());
            }
        });
        System.out.println(mx.toString());

        // This is in java 8 using java lambda it looks like this
        Person mx8 = max(list1,Comparator.comparing(Person::getName)
                .thenComparing(Person::getAge));


        Person maxnew = maxN(list1);
        System.out.println(maxnew.toString());
        System.out.println(mx8.toString());

         List<Integer> list = Arrays.asList(15,25,789798);
         Integer m =  max(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }
        });
        System.out.println(m);
    }

    public void run(){
        // tuda mojno dobavit shto ugodno qotori nasledovana ot qlassa Number
        List<? super Number> list = new ArrayList<>();
        list.add(15L);
        list.add(15);
        list.add(15D);


    }
}
