package graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class BfsConnectionList {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int m = cin.nextInt();
        List<List<Integer>> g = new ArrayList<>();
        for(int i = 0 ; i <= m; i++){
            g.add(new ArrayList<>());
        }
        for(int i = 0 ; i < m; i++){
            int v1,v2;
            v1 = cin.nextInt();
            v2 = cin.nextInt();
            g.get(v1).add(v2);
            g.get(v2).add(v1);
        }
        for (int i = 0; i < g.size(); i++)
        {
            System.out.print("\nAdjacency list of vertex: "
                + i + " ");
            for(int j = 0 ; j < g.get(i).size() ;j ++){
                System.out.println("-> " + g.get(i).get(j));
            }
        }
    }
}
