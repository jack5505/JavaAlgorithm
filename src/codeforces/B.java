package codeforces;

import java.util.Scanner;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class B {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n , k;
        n = cin.nextInt();
        k = cin.nextInt();
        int a[] = new int[n + 1];
        for (int i = 0; i < n ; i++) {
            a[i] = cin.nextInt();
        }
        int dp [] = new int[n + 1];
        dp[0] = a[0];
        for(int i = 1 ; i < n ;i ++){
            dp[i] = dp[i - 1] + a[i];
        }
        int min = dp[n - 1];
        int ans = 0;
        for(int i = 1 ; i < n - k;i ++){
            if(dp[k + i - 1] - dp[i - 1] <= min){
                min = dp[k + i - 1] - dp[i - 1];
                ans = i;
            }
        }
        System.out.println(ans + 1);
    }
}
