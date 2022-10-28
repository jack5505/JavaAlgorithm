package graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class Dfs {
    static int [] time_in;
    static int [] time_out;
    static List<List<Integer>> graph;
    static boolean used[];
    static int timer;
    static void dfs(int v){
        used[v] = true;
        time_in[v] = timer++;
        for(int i = 0 ; i < graph.get(v).size() ;i ++){
            int to = graph.get(v).get(i);
            if(!used[to]){
                dfs(to);
            }
        }
        time_out[v] = timer++;

    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        graph = new ArrayList<>();
        int n = cin.nextInt();
        time_in = new int[n + 1];
        time_out = new int[n + 1];
        used = new boolean[n + 1];
        for(int i = 0 ; i <= n;i ++){
            graph.add(new ArrayList<>());
        }
        int m = cin.nextInt();
        int v1,v2;
        for(int i = 1 ; i <= m;i ++){
            v1 = cin.nextInt();
            v2 = cin.nextInt();
            graph.get(v1).add(v2);
            graph.get(v2).add(v1);
        }
        dfs(1);
        for(int i = 1; i <= n;i ++){
            System.out.println("index: " + i + " " + time_in[i] + " " + time_out[i]);
        }

    }
}
