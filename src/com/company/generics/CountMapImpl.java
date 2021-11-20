package com.company.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Sabirov Jakhongir
 */
public class CountMapImpl<K> implements CountMap<K> {

    private HashMap<K,Integer> hashMap = new HashMap<>();

    @Override
    public void add(K key) {
        hashMap.put(key,hashMap.getOrDefault(key,0) + 1);
    }

    @Override
    public int getCount(Object key) {
        return hashMap.getOrDefault(key,0);
    }

    @Override
    public int size() {
        return hashMap.size();
    }

    @Override
    public Map asMap() {
        return hashMap;
    }

    @Override
    public void copyTo(CountMap destination) {
       destination = this;
    }
}
