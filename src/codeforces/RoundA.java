package codeforces;

import java.util.Scanner;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class RoundA {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int a[][] = new int[n + 1][n + 1];
        boolean used[] = new boolean[n + 1];
        for (int i = 1; i <= n  ; i++) {
            for(int j = 1; j <= n;j ++){
                a[i][j]  = cin.nextInt();
                if(a[i][j] == 3){
                    used[i] = used[j] = true;
                }
                if(a[i][j] == 1){
                    used[i] = true;
                }
                if(a[i][j] == 2){
                    used[j] = true;
                }
            }
        }
        int ans = 0;
        for(int i = 1 ; i <= n ;i ++){
            if(!used[i])
                ans ++;
        }
        System.out.println(ans);
        for (int i = 1; i <= n  ; i++) {
            if(!used[i]){
                System.out.print(i + " ");
            }
        }

    }
}
