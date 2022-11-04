package leetcodes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class Solution5 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int m = cin.nextInt();
        int a [] [] = new int[n][m];
        for(int i =  0 ; i < n; i ++){
            for(int j = 0 ; j < m;j ++){
                a[i][j] = cin.nextInt();
            }
        }
        System.out.println(calculateMinimumHP(a));
    }
    public static int calculateMinimumHP(int[][] dungeon) {
        int n = dungeon.length;
        int m = dungeon[0].length;
        int dp[][] = new int[n][m];
        dp[n - 1][m - 1] = dungeon[n - 1][m - 1] >= 1 ? 0 : dungeon[n - 1][m - 1];
        for(int i = n - 2 ; i >= 0 ;i --){
            dp[i][ m - 1] = (dp[i + 1][m - 1] +  dungeon[i][m - 1]) >= 1 ? 0 : (dp[i + 1][m - 1] +  dungeon[i][m - 1]);
        }
        for(int i = m - 2 ; i >= 0 ;i --){
            dp[n - 1][i] = (dp[n - 1][i + 1] + dungeon[n - 1][i]) >= 1 ? 0 : (dp[n - 1][i + 1] + dungeon[n - 1][i]);
        }
        for(int i = n - 2 ; i >= 0; i --){
            for(int j = m - 2 ; j >= 0; j --){
                dp[i][j] = (Math.max(dp[i + 1][j],dp[i][j + 1]) + dungeon[i][j]) >= 1 ? 0 :(Math.max(dp[i + 1][j],dp[i][j + 1]) + dungeon[i][j]);
            }
        }
        return Math.abs(dp[0][0])  + 1;
    }
}
