package codeforces;

import java.util.HashMap;
import java.util.Map;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class TestMap {
    public static void main(String[] args) {
        Map<Integer,Integer> mp = new HashMap<>();
        mp.put(3,mp.getOrDefault(3,0) + 1);
        mp.put(3,mp.getOrDefault(3,0) + 1);
        System.out.println(mp.get(3));
    }
}
