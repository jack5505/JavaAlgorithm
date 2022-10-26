package codeforces;

import java.util.Scanner;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class Div769 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();
        while (t -- > 0){
            int n = cin.nextInt();
            int p = 1;
            while (2 * p < n){
                p <<= 1;
            }
            for(int i = p - 1 ; i >= 0 ;i --){
                System.out.print(i + " ");
            }
            System.out.print(p + " ");
            for(int i = p + 1; i < n;i ++){
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }
}
