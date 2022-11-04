package leetcodes;

import java.util.Arrays;
import java.util.Scanner;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class CodeForcesC {
    static int cnt[][] = new int[1001][2];
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int a [] = new int[n];
        for(int i = 0 ; i < n;i++){
            a[i] = cin.nextInt();
            cnt[a[i]][i % 2] ++;
        }
        Arrays.sort(a);
        for(int i = 0 ; i < n; i ++){
            cnt[a[i]][i % 2] --;
        }
        for(int i = 0 ; i < n; i ++){
            System.out.println(cnt[a[i]][i % 2]);
        }


    }
}
