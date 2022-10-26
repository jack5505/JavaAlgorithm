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
public class GraphBfs {
    static class Visited{
        int vertex;
        int catPeriod;

        public Visited(int vertex, int catPeriod) {
            this.vertex = vertex;
            this.catPeriod = catPeriod;
        }
    }
    /*
    5 3
    1 1 1 1 1
    1 2
    2 3
    3 4
    4 5
     */

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int m = cin.nextInt();
        int cat []  = new int[n + 1];
        for (int i = 1; i <= n ; i++) {
            cat[i] = cin.nextInt();
        }
        List<List<Integer>> graph = new ArrayList<>();
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
        boolean used[] = new boolean[n + 1];
        int d[] = new int [n + 1];
        int r[] = new int [n + 1];
        Queue<Integer> path = new LinkedList<>();
        path.add(1);
        int ans = 0;
        used[1] = true;
        while (!path.isEmpty())
        {
            int current = path.poll();
            for(int i = 0 ; i < graph.get(current).size() ;i ++){
                int to = graph.get(current).get(i);
                if(cat[to] == 1)
                    d[to] = 1;
                if(!used[to])
                {
                    r[current] ++;
                    if(cat[to] == 1){
                        d[to] = d[current] + 1;
                    }
                    else{
                        if(d[current] > m) {
                            d[to] = d[current];
                        }
                    }
                    used[to] = true;
                    path.add(to);
                }

            }
        }
        for(int i = 1 ; i <= n ; i++){
            if(d[i] <= m && r[i] == 0)
                ans ++;
        }
        System.out.println(ans);



    }
}
