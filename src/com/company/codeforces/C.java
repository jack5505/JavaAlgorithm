package com.company.codeforces;

import java.util.Scanner;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class C {
    public static int wayX[] = {1,0,-1,0};
    public static int wayY[] = {0,1,0,-1};
    static int n , m;
    static int r2,c2;
    static boolean found = false;
    static char a[][];
    static class Pair{
        int x,y;
        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public static void dfs(int x, int y)
    {
           a[x][y] = 'X';
           for(int i = 0 ; i < 4 ; i++)
           {
               int newX = wayX[i] + x;
               int newY = wayY[i] + y;
               if(boundaries(newX,newY) && newX == r2 && newY == c2 && a[newX][newY] == 'X'){
                    found = true;
               }
               if(boundaries(newX,newY) && a[newX][newY] == '.'){
                   dfs(newX,newY);
               }
           }
    }

    private static boolean boundaries(int x, int y) {
        return 1 <= x && x <= n && 1 <= y && y <= m;
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        n = cin.nextInt();
        m = cin.nextInt();
        a = new char[n + 1] [m + 1];
        for(int i = 1 ; i <= n;i ++){
            String temp = cin.next();
            for(int j = 1; j <= m ;j ++){
                a[i][j] = temp.charAt(j - 1);
            }
        }
        int r1,c1;
        r1 = cin.nextInt();
        c1 = cin.nextInt();
        r2 = cin.nextInt();
        c2 = cin.nextInt();
        dfs(r1,c1);
        System.out.println(found ? "YES" : "NO");


    }
}
