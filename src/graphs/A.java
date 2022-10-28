package graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class A {
    static List<Integer> list;
    static boolean found;
    static void dfs(int a, int b){
        list.add(b);
        if(b <= a){
            if(b == a)
                found = true;
            return;
        }
        if((b - 1) % 10 == 0)
             dfs(a, (b - 1)/10);
        if(b % 2 == 0)
            dfs(a, b / 2);
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int a = cin.nextInt();
        int b = cin.nextInt();
        list = new ArrayList<>();
        dfs(a,b);
        if(found){
            System.out.println("YES\n" + list.size());
            for (int i = list.size() - 1; i >= 0; i --) {
                System.out.print(list.get(i) + " ");
            }
            return;
        }
        System.out.println("NO");
    }
}
