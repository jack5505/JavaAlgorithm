package codeforces;

import java.util.Scanner;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class EasySolution {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
//        int test = cin.nextInt();
        int test = 1;
        while (test -- > 0) {
            solve(cin);
        }
    }
    static int x[] = {0,0,1,-1,1,-1,-1,1};
    static int y[] = {1,-1,0,0,1,1,-1,-1};

    private static void solve(Scanner cin) {
         int n = cin.nextInt();
         int a[] [] = new int[n + 1][n + 1];
         enablePath(0,1,a,1,n);
         for(int i = 0 ; i < n;i ++){
             for (int j = 0; j < n ; j++) {
                 System.out.print(a[i][j] + " " );
             }
             System.out.println();
         }
    }
    public static void enablePath(int xP, int yP,int a [][],int mark,int n){
        a[xP][yP] = mark;
        for(int i = 0 ; i < x.length ;i ++){
            int tempX = xP;
            int tempY = yP;
            while (tempX + x[i] >= 0 && tempX + x[i] < n && tempY + y[i] >= 0 && tempY + y[i] < n){
                tempX += x[i];
                tempY += y[i];
                a[tempX][tempY] += mark;
            }
        }
    }
}
