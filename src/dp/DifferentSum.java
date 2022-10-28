package dp;

import java.util.Scanner;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class DifferentSum {
    static int a[][];
    static int n, m;
    static long ans;
    static void  go(int i , int j, long sum){
        sum += a[i][j];
        if(i == n - 1   && j == m - 1 ){
            ans = Math.min(sum,ans);
            return;
        }
        if(i < n -1 )
            go(i + 1,j , sum);
        if(j < m - 1)
            go(i,j + 1,sum);
    }
    public static void main(String[] args) {
        ans = (long) 1e5;
        Scanner cin = new Scanner(System.in);
        n = cin.nextInt();
        m = cin.nextInt();
        a = new int[n][m];
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < m ; j++) {
                a[i][j] = cin.nextInt();
            }
        }
        System.out.println("start");
        go(0,0,0);
        System.out.println(ans);

    }
}
