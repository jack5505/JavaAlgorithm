package dp;

import java.util.Scanner;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class BadStringDpSolve {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int dp[][] = new int[n + 1][3];
        dp[0][1] = 1; // ?
        for(int i = 0 ; i < 3 ;i ++){
            dp[1][i] = 1;
        }
        // 0 A 1 B 2 C
        for(int i = 2 ; i <= n ;i ++)
        {
            for(int j = 0 ; j < 3 ; j++)
            {
                for(int k = 0 ; k < 3 ; k++)
                {
                    if(j == 0 && k == 1) {
                        continue;
                    }
                    dp[i][j] += dp[i - 1][k];
                }
            }
        }
        for(int i = 1; i <= n; i++)
        {
            for(int k = 0 ; k < 3 ; k++)
            {
                System.out.print(dp[i][k] + " ");
            }
            System.out.println("------");
        }
        System.out.println(dp[n][0] + dp[n][1] + dp[n][2]);

    }
}
