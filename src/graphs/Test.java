package graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class Test {
    static boolean used[] = new boolean[100001];
    /*
    5
0 1 0 0 0
1 0 1 0 0
0 1 0 1 0
0 0 1 0 1
0 0 0 1 0
1 5

     */
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int t;
        int d[] = new int[100001];
        for(int i = 0 ; i <= n ;i ++){
            d[i] = -1;
        }
        List<List<Integer>> g = new ArrayList<>();
        for(int i = 0 ; i <= n + 10 ; i++){
            g.add(new ArrayList<>());
        }
        for (int i = 1; i <= n; i++)
        {
            for(int j = 1 ;j <= n; j ++ )
            {
                t = cin.nextInt();
                if(t != 0){
                    g.get(i).add(j);
                    g.get(j).add(i);
                }
            }
        }
        int start, end;
        start = cin.nextInt();
        end   = cin.nextInt();
        used[start] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        d[start] = 0;
        while (!queue.isEmpty()){
            int to = queue.poll();
            for(int i = 0 ; i < g.get(to).size(); i ++)
            {
                int v = g.get(to).get(i);
                if(!used[v]) {
                    used[v] = true;
                    queue.add(v);
                    d[v] = d[to] + 1;
                }
            }
        }
        System.out.println(d[end]);
    }
}
