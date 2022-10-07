package graphs;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;


/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class E59 {
    static StreamTokenizer st;
    static ArrayList<Integer>[] ages;
    static class Que_Elements {
        int p, v;
        ArrayList<Integer> path;
    }

    public static void main(String[] args) throws  IOException{
        st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int n = nextInt();
        int m = nextInt();
        int k = nextInt();
        ages = new ArrayList[n+1];
        for (int i = 1; i <= n; i++) {
            ages[i] = new ArrayList<Integer>();
        }
        for (int i = 1; i <= m; i++) {
            int v1 = nextInt();
            int v2 = nextInt();
            ages[v1].add(v2);
            ages[v2].add(v1);
        }
        Map<Long, Boolean> map = new HashMap<Long, Boolean>();
        long h = 3001;
        for (int i = 1; i <= k; i++) {
            int a = nextInt();
            int b = nextInt();
            int c = nextInt();
            map.put(a + b * h + c * h * h, true);
        }
        Queue<Que_Elements> q = new LinkedList<Que_Elements>();
        Que_Elements node = new Que_Elements();
        node.p = 0;
        node.v = 1;
        node.path = new ArrayList<Integer>();
        node.path.add(1);
        q.add(node);
        boolean[][]used = new boolean[n+1][n+1];
        while (!q.isEmpty()) {
            node = new Que_Elements();
            node = q.poll();
            int v = node.v;
            int p = node.p;
            if (v==n) {
                int size = node.path.size();
                pw.println(size-1);
                for (int i = 0; i < size; i++) {
                    pw.print(node.path.get(i)+" ");
                }
                pw.close();
                return;
            }
            for (int to : ages[v]) {
                if (!used[v][to] && !map.containsKey(p+v*h+to*h*h)) {
                    Que_Elements new_node = new Que_Elements();
                    new_node.p = v;
                    new_node.v = to;
                    new_node.path = new ArrayList<Integer>();
                    new_node.path.addAll(node.path);
                    new_node.path.add(to);
                    used[v][to] = true;
                    q.add(new_node);
                }
            }
        }
        pw.print(-1);
        pw.close();
    }

    private static int nextInt() throws IOException{
        st.nextToken();
        return (int) st.nval;
    }
}
