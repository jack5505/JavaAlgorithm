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
        int n = cin.nextInt();
        System.out.println(n +" " + Integer.toBinaryString(n));
        n = (n ^ (1 << 2));
        System.out.println(n + " " + Integer.toBinaryString(n));
    }
}
