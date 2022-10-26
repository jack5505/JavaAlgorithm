package codeforces;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class TestC {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int cap = cin.nextInt();
        List<List<Integer>> list = new ArrayList<>();
        int day;
        int cnt;
        for(int i = 0 ; i <= n ;i ++){
            list.add(new ArrayList<>());
        }
        Map<Integer,Long> summAll = new HashMap<>();
        for(int i = 0 ; i <= 3000 ; i ++){
            summAll.put(i,0L);
        }
        Set<Integer> days = new HashSet<>();
        for(int i = 1 ; i <= n ; i ++)
        {
            day = cin.nextInt();
            cnt = cin.nextInt();
            days.add(day);
            summAll.put(day,summAll.getOrDefault(day ,0L) + cnt);
        }
        List<Integer> eachDays = new ArrayList<>(days);
        long need;
        long ans = 0;
        int curday = 0;
        for(int i = 1 ;i <= 3000; i++)
        {
            curday = i;
            if(i == 1){
                need = Math.min(cap,summAll.get(curday));
                summAll.put(curday,summAll.get(curday) - need);
                ans += need;
            }
            else {
                need = Math.min(cap, summAll.get(curday - 1));
                if(need < cap){
                    long add = Math.min(cap - need, summAll.get(curday));
                    need += add;
                    summAll.put(curday,summAll.get(curday) - add);
                }else{
                    summAll.put(curday - 1,summAll.get(curday - 1) - need);
                }
                ans += need;
            }
        }
        ans += Math.min(summAll.get(curday),cap);
        System.out.println(ans);
    }
}
