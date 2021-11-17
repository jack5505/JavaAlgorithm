package com.company.core;

import java.util.ArrayList;
import java.util.List;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class WildCardUse {
    static class NaturalNumber{
        int i;

        public NaturalNumber(int i) {
            this.i = i;
        }
    }
    static class EvenNumber extends NaturalNumber{
        public EvenNumber(int i) {
            super(i);
        }

        @Override public String toString() {
            return "EvenNumber{" +
                "i=" + i +
                '}';
        }
    }

    public static void main(String[] args) {
        List<EvenNumber> list = new ArrayList<>();
        list.add(new EvenNumber(32));
        List<? extends NaturalNumber> le = list;
        // le.add(new NaturalNumber(3));
        // le.add(new EvenNumber(3));

        //Because List<EvenNumber> is a subtype of List<? extends NaturalNumber>, you can assign le to ln. But you cannot use ln to add a natural number to a list of even numbers. The following operations on the list are possible:
        //
        //You can add null.
        //You can invoke clear.
        //You can get the iterator and invoke remove.
        //You can capture the wildcard and write elements that you've read from the list.
    }
}
