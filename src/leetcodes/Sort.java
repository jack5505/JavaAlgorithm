package leetcodes;

import java.util.Arrays;
import java.util.Scanner;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class Sort {
    static boolean found = false;
    static int dx[] = {1,-1,0,0};
    static int dy[] = {0,0,1,-1};
    static boolean used[][];
    static int dp[][];
    static char a[][];
    static int mx = 0;
    static String wordS;
    static int n,m;
    static void dfs(int v1, int v2, int st){
        if(dp[v1][v2] == 0){
            dp[v1][v2] = 1;
        }
        used[v1][v2] = true;
        for(int i = 0 ; i < dx.length ;i ++){
            int toX = v1 + dx[i];
            int toY = v2 + dy[i];
            if(toX >= 0 && toX < n && toY>= 0 && toY < m && st < wordS.length()){
                if(a[toX][toY] == wordS.charAt(st) && !used[toX][toY]){
                    dp[toX][toY] = dp[v1][v2] + 1;
                    mx = Math.max(mx,dp[toX][toY]);
                    dfs(toX,toY,st + 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        n = cin.nextInt();
        m = cin.nextInt();
        a = new char[n + 1][m + 1];
        dp = new int[n + 1][m + 1];
        used = new boolean[n + 1][m + 1];
        for(int i = 0 ; i < n; i++){
            String t;
            t = cin.next();
            a[i] = t.toCharArray();
        }
        wordS = cin.next();
        System.out.println(exist(a,wordS));




    }
    public static boolean exist(char[][] board, String word) {
        n = board.length;
        m = board[0].length ;
        a = board;
        wordS = word;
        dp = new int[n + 1][m + 1];
        for(int i = 0 ; i < n ;i ++){
            for(int j = 0 ; j < m ;j ++){
                if(a[i][j] == wordS.charAt(0)){
                    mx = 1;
                    dfs(i,j,1);
                    System.out.println("---------");
                    print();
                    System.out.println("-----------");
                    if(mx == word.length())
                        return true;
                    dp = new int[n + 1][m + 1];
                }
            }
        }
        return false;

    }
    static void print(){
        for(int i = 0 ; i < dp.length ;i ++){
            System.out.println(Arrays.toString(dp[i]));
        }
    }




}
