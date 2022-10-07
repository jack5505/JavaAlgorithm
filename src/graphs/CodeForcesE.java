package graphs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class CodeForcesE {
    static boolean used [] []= new boolean [3001][3001];
    static class node_graph{
        int p,c;
        ArrayList<Integer> path;

        public node_graph(int p, int c, ArrayList<Integer> path) {
            this.p = p;
            this.c = c;
            this.path = path;
        }

        public node_graph() {
        }
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n , m , k;
        n = cin.nextInt();
        m = cin.nextInt();
        k = cin.nextInt();
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0 ; i <= n ;i ++){
            list.add(new ArrayList<>());
        }
        int v1, v2;
        for(int i = 1; i <= m ;i ++)
        {
            v1 = cin.nextInt();
            v2 = cin.nextInt();
            list.get(v1).add(v2);
            list.get(v2).add(v1);
        }
        Map<String,Boolean> notPath = new HashMap<>();
        int a, b ,c;
        for(int i = 1 ; i <= k; i ++){
            a = cin.nextInt();
            b = cin.nextInt();
            c = cin.nextInt();
            notPath.put(a + "" + b + "" + c,true);
        }
        Queue<node_graph> start = new LinkedList<>();
        used[1][1] = true;
        node_graph node = new node_graph();
        node.p = 0;
        node.c = 1;
        node.path = new ArrayList<>();
        node.path.add(1);
        start.add(node);
        while (!start.isEmpty())
        {
            node = new node_graph();
            node = start.poll();
            int v = node.c;
            int p = node.p;
            if(v == n){
                System.out.println(node.path.size() - 1);
                for(int i = 0 ; i < node.path.size() ;i ++){
                    System.out.print(node.path.get(i) + " ");
                }
                return;
            }
            for(int i =  0 ; i < list.get(v).size(); i ++)
            {
                int to = list.get(v).get(i);
                if(!used[v][to] && !notPath.containsKey(p + "" + v + "" + to))
                {
                    used[v][to] = true;
                    node_graph new_node = new node_graph();
                    new_node.path = new ArrayList<>();
                    new_node.p = v;
                    new_node.c = to;
                    new_node.path.addAll(node.path);
                    new_node.path.add(to);
                    start.add(new_node);
                }
            }

        }
        System.out.println(-1);

    }
}
