package com.company;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class GraphDfsIterative {
    static LinkedList<Integer> adj[];
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n , m;
        n  = cin.nextInt();
        m  = cin.nextInt();
        adj = new LinkedList[n + 1];
        for(int i = 0 ; i <= n ;i ++){
            adj[i] = new LinkedList<>();
        }
        int v1,v2;
        for(int i = 1 ; i <= m ;i ++){
            v1 = cin.nextInt();
            v2 = cin.nextInt();
            adj[v1].add(v2);
            adj[v2].add(v1);
        }
        boolean used[] = new boolean[n + 1];
        Stack<Integer> stack = new Stack<>();
        int start = cin.nextInt();
        stack.push(start);
        while (!stack.isEmpty()){
          start = stack.peek();
          stack.pop();

          if(!used[start]){
              System.out.println("vertex in " + start);
              used[start] = true;
          }
          for(int i = 0 ; i < adj[start].size() ;i ++){
              int temp = adj[start].get(i);
              if(!used[temp]){
                  stack.push(temp);
              }
          }
        }
    }
}
