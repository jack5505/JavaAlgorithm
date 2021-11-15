package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class GraphDfsRecursion {
    // This example of dfs algorithm that implemented in java with recursion
    static LinkedList<Integer> adj[];
    static boolean used[] = new boolean[10001];
    static void dfs(int v){

        System.out.println("vertex in " + v);
        used[v] = true;
        for(int i = 0  ; i < adj[v].size(); i ++){
            int to = adj[v].get(i);
            if(!used[to]){
                dfs(to);
            }
        }

    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n , m, v1, v2;
        n = cin.nextInt();
        m = cin.nextInt();
        adj = new LinkedList[n + 1];
        for(int i = 0 ; i <= n ;i ++){
          adj[i] = new LinkedList<>();
        }
        for(int i = 1 ; i <= m;i ++){
            v1 = cin.nextInt();
            v2 = cin.nextInt();
            adj[v1].add(v2);
            adj[v2].add(v1);
        }
        int v;
        v = cin.nextInt();
        dfs(v);
    }
}
