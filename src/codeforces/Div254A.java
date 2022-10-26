package codeforces;

import java.util.Queue;
import java.util.Scanner;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class Div254A {
    static int arrX[] = {0,0,1,-1};
    static int arrY[] = {1,-1,0,0};
    static char[][] a;
    static int n,m;
    static class Way{
        int x,y;

        public Way(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public Way() {
        }
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        n = cin.nextInt();
        m = cin.nextInt();
        a = new char[n + 1][m + 1];
        for (int i = 0; i <  n; i++) {
            String s = cin.next();
            a[i] = s.toCharArray();
        }
        int cnt = 0;
        char [][] ans = new char[n][m];
        for(int i = 0 ; i < n;i ++){
            for(int j = 0 ; j < m;j ++){
                if(cnt % 2 == 0)
                    ans[i][j] = 'B';
                else
                    ans[i][j] = 'W';
                cnt++;
            }
            if(m % 2 == 0)
                cnt++;
        }

        System.out.println("---------");
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < m; j++) {
                if(a[i][j] == '.'){
                    System.out.print(ans[i][j]);
                }else
                    System.out.print(a[i][j]);
            }
            System.out.println();

        }
    }


}
