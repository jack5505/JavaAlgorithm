package dp;

import java.util.Arrays;
import java.util.Scanner;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class BadStringSolutionRecursion {
    static int n;
    static int ans ;
    static void go(int pos,char a[]){
        if(pos == n){
            ans++;
            // System.out.println(Arrays.toString(a));
            return;
        }
        a[pos] = 'a';
        go(pos + 1,a);
        if((pos >= 1 && a[pos - 1] != 'a') || pos == 0) {
            a[pos] = 'b';
            go(pos + 1, a);
        }
        a[pos] = 'c';
        go(pos + 1,a);
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        n = cin.nextInt();
        char x [] = new char[n];
        go(0,x);
        System.out.println(ans);
    }
}
