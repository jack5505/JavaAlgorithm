package graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class AntOnTree {
    static List<List<Integer>> graph = new ArrayList<>();
    public static boolean used[];
    public static int path[];
    public static int tin[];
    public static int tout[];
    public static int timer;
    public static void dfs(int v){
        used[v] = true;
        tin[v] = timer ++;
        System.out.println(v);
        for(int i = 0 ; i < graph.get(v).size() ;i ++){
            int to = graph.get(v).get(i);
            if(!used[to]){
                dfs(to);
            }
        }
        tout[v] = timer++;
    }
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        used = new boolean[n + 1];
        tin = new int[n + 1];
        tout = new int[n + 1];
        for(int i = 0 ; i <= n;i ++){
            graph.add(new ArrayList<>());
        }
        int v1,v2;
        for(int i =  0 ; i < n - 1 ; i++){
            v1 = cin.nextInt();
            v2 = cin.nextInt();
            graph.get(v1).add(v2);
            graph.get(v2).add(v1);
        }
        dfs(1);
        for(int i = 1 ; i <= n ;i ++){
            System.out.println(i + " " + tin[i] + " " + tout[i]);
        }





    }
    public static void makeItClear(){
        for(int i = 0 ; i < used.length ;i ++){
            used[i] = false;
        }
    }
}
