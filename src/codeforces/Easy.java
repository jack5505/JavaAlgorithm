package codeforces;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class Easy {
    static List<List<Integer>> graph;
    static boolean used[];
    static int cat[];
    static int m;
    static int ans;
    /*
    5 3
    1 1 1 1 1
    1 2
    2 3
    3 4
    4 5
     */
    static void dfs(int v, int k){
        used[v] = true;
        boolean ok = true;
        if(cat[v] == 1)
            k++;
        else
            k = 0;
        if(k > m)
            return;
        for(int i = 0 ; i < graph.get(v).size(); i++){
            int to = graph.get(v).get(i);
            if(!used[to]){
                ok = false;
                dfs(to,k);
            }
        }
        if(ok && k <= m)
            ans ++;


    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        m = cin.nextInt();
        cat  = new int[n + 1];
        used = new boolean[n + 1];
        for (int i = 1; i <= n ; i++) {
            cat[i] = cin.nextInt();
        }
        graph = new ArrayList<>();
        for(int i = 0 ; i <= n;i ++){
            graph.add(new ArrayList<>());
        }
        for(int i = 1; i <n ;i ++){
            int v1,v2;
            v1 = cin.nextInt();
            v2 = cin.nextInt();
            graph.get(v1).add(v2);
            graph.get(v2).add(v1);
        }
        dfs(1,0);
        System.out.println(ans);






    }
}
