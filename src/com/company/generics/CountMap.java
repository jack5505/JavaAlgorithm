package com.company.generics;

import java.util.Map;

/**
 * @author Sabirov Jakhongir
 */
public interface CountMap<K>  {

    void add(K key);

    int getCount(K key);

    int size();

    Map asMap();

    void copyTo(CountMap destination);
}
