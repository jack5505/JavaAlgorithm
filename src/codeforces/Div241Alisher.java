package codeforces;

import java.util.Scanner;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class Div241Alisher {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int m, n;
        m = cin.nextInt();
        n = cin.nextInt();
        int t [] [] = new int[m + 1][n + 1];
        for (int i = 0; i < m ; i++) {
            for (int j = 0; j <  n; j++) {
                t[i][j] = cin.nextInt();
            }
        }
        int dp[][] = new int[m + 1] [n  + 1] ;
        dp[0][0] = t[0][0];
        for(int i = 1 ; i < n  ; i++){
            dp[0][i] += t[0][i] + dp[0][i - 1];
        }
        for (int i = 1; i < m ; i++) {
            dp[i][0] = dp[i - 1][0] + t[i][0];
            for (int j = 1; j < n ; j++) {
                dp[i][j] = Math.max(dp[i][j -1],dp[i - 1][j]) + t[i][j];
            }
        }

        for (int i = 0; i < m ; i++) {
            System.out.print(dp[i][n - 1] + " ");
        }
    }
}
