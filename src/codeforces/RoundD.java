package codeforces;

import java.util.Arrays;
import java.util.Scanner;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class RoundD {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int a[] = new int[n];
        for(int i = 0 ; i < n;i ++){
            a[i] = cin.nextInt();
        }
        long suma = 0;
        Arrays.sort(a);
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if(a[i] >= suma){
                suma += a[i];
                ans ++;
            }
        }
        System.out.println(ans);

    }
}
