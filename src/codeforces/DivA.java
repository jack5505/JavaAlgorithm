package codeforces;

import java.util.Scanner;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class DivA {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int a = cin.nextInt();
        int b = cin.nextInt();
        long coin [] = new long [n + 1];
        for (int i = 0; i < n; i++) {
                coin[ i ] = cin.nextLong();
        }
        for(int i = 0 ;i  < n ;i ++){
            System.out.print(((coin[i] * a) % b) / a  + " ");
        }
    }
}
