package graphs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class Div2D375 {
    static int exactSea;
    static int pred[][];
    static char a[][];
    static int n;
    static int m;
    static int k;
    static boolean used[][];
    static int pathX [] = {0,0,-1,1};
    static int pathY [] = {1,-1,0,0};
    static int mx  = 0;
    static class Sea{
        int seasize;
        int x;
        int y;

        public Sea(int seasize, int x, int y) {
            this.seasize = seasize;
            this.x = x;
            this.y = y;
        }
    }
    public static void dfs(int x, int y){
        used[x][y] = true;
        if(x == 0 || x == n -1 || y == 0 || y == m - 1 )
            mx = -10000;
        if(mx !=  -10000)
            mx ++;
        for(int i = 0 ; i < pathX.length ;i ++)
        {
            if(pathX[i] + x < 0 || pathX[i] + x >= n  || pathY[i] + y < 0 || pathY[i] + y >= m )
                continue;
            if(!used[x + pathX[i]][y + pathY[i]] && a[x + pathX[i]][y + pathY[i]] == '.'){
                dfs(x + pathX[i],y + pathY[i]);
            }
        }


    }
    public static void dfs2(int x, int y)
    {
        used[x][y] = true;
        a[x][y] = '*';
        for(int i = 0 ; i < pathY.length ;i ++){
            int toX = pathX[i] + x;
            int toY = pathY[i] + y;
            if(toX >= 0 && toX <= n - 1 && toY >= 0 && toY <= m - 1 && !used[toX][toY] && a[toX][toY] == '.'){
                dfs2(toX,toY);
            }
        }

    }
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);
        n = cin.nextInt();
        m = cin.nextInt();
        a = new char[n][m];
        pred = new int[n + 1][m + 1];
        used = new boolean[n + 1][m + 1];
        k = cin.nextInt();
        String s;
        for(int i = 0 ; i < n; i++){
            s = cin.next();
            a[i] = s.toCharArray();
        }
        List<Sea> list = new ArrayList<>();
        for(int i = 1; i < n - 1; i ++)
        {
            for(int j = 1; j < m - 1; j ++)
            {
                if(a[i][j] == '.' && !used[i][j]){
                    mx = 0;
                    dfs(i,j);
                    if(mx >= 1)
                        list.add(new Sea(mx,i,j));
                }

            }
        }
        for(int i = 0 ; i <= n ;i ++){
            for(int j = 0 ; j <=m ;j ++){
                used[i][j] = false;
            }
        }
        Collections.sort(list, new Comparator<Sea>() {
            @Override public int compare(Sea o1, Sea o2) {
                return Integer.compare(o1.seasize,  o2.seasize);
            }
        });
        int cnt = list.size();
        int ans = 0;
        for (Sea sea : list) {
            if(cnt > k){
                ans += sea.seasize;
                dfs2(sea.x,sea.y);
                cnt --;
            }
            else
                break;
        }
        System.out.println(ans);
        for(int i = 0 ; i < n; i++){
            for(int j = 0 ; j < m;j ++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}