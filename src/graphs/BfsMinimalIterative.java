package graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class BfsMinimalIterative {
    // bu misolda 1 vershinadan boshlab qolgan hamma vershinaga o`tish bo`yicha qancha uchga kirib o`tishlari bor
    // bu iterative yo`li orqali ishlagana 
    static boolean  used[] = new boolean[10001];
    static int d[] = new int[10001];
    public static void main(String[] args) {
        List<List<Integer>> lists = new ArrayList<>();
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int m = cin.nextInt();
        for(int i = 0; i <= m ;i ++){
            lists.add(new ArrayList<>());
        }
        for(int i = 1; i <= m ; i++){
            int v1, v2;
            v1 = cin.nextInt();
            v2 = cin.nextInt();
            lists.get(v1).add(v2);
            lists.get(v2).add(v1);
        }
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(1);
        used[1] = true;
        d[1] = 0;
        while (!queue.isEmpty()){
            int v = queue.poll();
            for(int i = 0 ; i < lists.get(v).size() ;i ++){
                int to = lists.get(v).get(i);
                if(!used[to]){
                    used[to] = true;
                    queue.add(to);
                    d[to] = d[v] + 1;
                }
            }
        }
        for(int i = 1 ;i <= n ;i ++){
            System.out.print(d[i] + " ");
        }


    }
}
