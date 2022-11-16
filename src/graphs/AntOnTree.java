package graphs;

import java.util.ArrayList;
import java.util.Collections;
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
    static int cnt[];
    static int pred[];
    public static int timer;
    public static void dfs(int v)
    {
        used[v] = true;
        tin[v] = timer ++;
        for(int i = 0 ; i < graph.get(v).size() ;i ++){
            int to = graph.get(v).get(i);
            if(!used[to]){
                dfs(to);
                pred[to] = v;
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
        pred = new int[n + 1];
        cnt = new int[n + 1];
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
        int k = 0;
        while (cin.hasNext()){
            cnt[k ++] = cin.nextInt();
        }
        List<Integer> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        int cur = cnt[0];
        while (true)
        {
            path.add(cur);
            if(cur == 1) break;
            cur = pred[cur];
        }
        Collections.reverse(path);
        ans.addAll(path);
        for(int i = 1 ; i <= k - 1 ;i ++)
        {
            int cr = cnt[i];
            while (true){
                    cr = pred[cr];
                    ans.add(cur);
                    if(upper(cr,cnt[i + 1]))
                        break;
            }
            int lcm = cnt[i];
            int st = cnt[i + 1];
            List<Integer> p = new ArrayList<>();
            while (true){
                if(st == lcm)
                    break;
                p.add(st);
                st = pred[st];
            }
            ans.addAll(path);
        }
        cur = cnt[k];
        path = new ArrayList<>();
        while (true){
            cur = pred[cur];
            if(cur == 1)
                break;
            path.add(cur);
        }
        ans.addAll(path);
        if(ans.size() == (2 * n ) - 1){
            for (Integer v: ans){
                System.out.print(v + " ");
            }
        }else{
            System.out.println(-1);
        }










    }
    // ancesstor of vertex b
    private static boolean upper(int a, int b) {
        return tin[a] <= tin[b] && tout[a] >= tout[b];
    }
}
