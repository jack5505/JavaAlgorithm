package leetcodes;

import java.util.Scanner;

/*
 *
 *  @author Sabirov Jakhongir
 *  MSU ALGORITHM DP
 */
public class Solution4 {
    public static void main(String[] args) {
        int n ,m;
        Scanner cin = new Scanner(System.in);
        n = cin.nextInt();
        m = cin.nextInt();
        int a[][] = new int[n][m];
        for(int i = 0 ; i < n;i ++){
            for(int j = 0 ; j < m;j ++){
                a[i][j] = cin.nextInt();
            }
        }
        int dp[][] = new int[n][m];
        for(int i = 0 ; i < m ;i ++){
            dp[0][i] = a[0][i];
        }

        for(int i = 1 ; i < n ;i ++)
        {
            for(int j = 0 ; j < m;j ++)
            {
                dp[i][j] = dp[i - 1][j] + a[i][j];
                for(int k = -1 ; k <= 1 ; k += 2)
                {
                    if(j + k < 0  || j + k >= m)
                        continue;
                    if(dp[i][j] < dp[i - 1][j + k] + a[i][j]){
                        dp[i][j] = dp[i - 1][j + k] + a[i][j];
                    }
                }
            }
        }
        int mx = 0;
        for(int i = 0 ; i < m;i ++){
            mx = Math.max(mx,dp[n - 1][i]);
        }
        System.out.println(mx);
    }
}
