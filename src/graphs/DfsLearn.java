package graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class DfsLearn {
    public static int dp[];
    public static boolean used[];
    public static List<List<Integer>> vertex;
    public static void dfs(int v){
        used[v] = true;
        for(int i = 0 ; i < vertex.get(v).size();i ++){
            int to = vertex.get(v).get(i);
            if(!used[to]){
                dp[to] = dp[v] + 1;
                dfs(to);
            }
        }
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int m = cin.nextInt();

        dp = new int[n + 1];
        used = new boolean[n + 1];
        vertex = new ArrayList<>();
        for(int i = 0 ; i <= n ;i ++){
            vertex.add(new ArrayList<>());
        }
        int v1,v2;
        for(int i = 0 ; i < m;i ++){
            v1 = cin.nextInt();
            v2 = cin.nextInt();
            vertex.get(v1).add(v2);
            vertex.get(v2).add(v1);
        }
        dfs(1);
        for(int i = 1; i <= n; i++){
            System.out.print(dp[i] + " ");
        }



    }
}
