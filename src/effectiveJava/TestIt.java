package effectiveJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class TestIt {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        String s;
        Map<String,Integer> map = new HashMap<>();
        List<String> answer = new ArrayList<>();
        for(int i = 1 ; i <= n ;i ++)
        {
            s = cin.next();
            if(!map.containsKey(s)){
                map.put(s,1);
                answer.add("OK");
            }else{
                answer.add(s + map.get(s));
                map.put(s,map.get(s) + 1);
            }
        }
        answer.forEach(System.out::println);




    }
}
