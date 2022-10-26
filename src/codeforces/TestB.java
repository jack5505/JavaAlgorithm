package codeforces;

import java.util.Scanner;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class TestB {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();
        while (t -- > 0){
            solve(cin);
        }
    }
    public static void  solve(Scanner cin)
    {
        int n = cin.nextInt();
        int ans [] = new int[n + 1];
        if(n == 3 || n == 1){
            System.out.println(-1);
            return;
        }
        if(n % 2 == 0){
            for(int i = n ; i >= 1 ; i--){
                System.out.print(i + " ") ;
            }
            System.out.println();
        }else{
            for(int i = n ; i > n/2 + 1; i --){
                System.out.print(i + " ");
            }
            for(int i = 1; i <= n /2 + 1; i ++){
                System.out.print(i + " ");
            }
            System.out.println();

        }


    }
}
