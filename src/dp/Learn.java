package dp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class Learn {
    static boolean [] used;
    static int [] f;
    static int fib(int n )
    {
        if(n < 2)
            return 1;
        if(used[n])
            return f[n];
        int res =fib(n - 1) + fib(n - 2);
        used[n] = true;
        f[n] = res;
        return res;
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        used = new boolean[100];
        f = new int[100];
        System.out.println(fib(n));


    }
}
