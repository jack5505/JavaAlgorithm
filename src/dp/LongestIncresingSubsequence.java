package dp;

import java.util.Scanner;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class LongestIncresingSubsequence {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int a [] = new int[n + 1];
        for (int i = 0; i <  n; i++) {
            a [i] = cin.nextInt();
        }
        int dp [] = new int[n + 1];
        int mx = 0;
        for(int i = 0 ; i < n; i++){
            dp[i] = 1;
            for(int j = 0; j < i ;j ++){
                if(a[i] > a[j] && dp[j] + 1 > dp[i]){
                    dp[i] = dp[j] + 1;
                    mx = Math.max(dp[i],mx);
                }
            }
        }
        System.out.println(mx);

    }
}
