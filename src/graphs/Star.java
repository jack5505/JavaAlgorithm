package graphs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class Star {
    static boolean used[][] = new boolean[301][301];
    static int x[] = {1,-1,0,0};
    static int y[] = {0,0,-1,1};
    static class Pair{
        int x,y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int m = cin.nextInt();
        char a[] [] = new char[n][m];
        for(int i = 0 ; i < n ;i ++){
            String s = cin.next();
            a[i] = s.toCharArray();
        }
        int ans = 0;
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < m;j ++)
            {
                if(a[i][j] == '*' && !used[i][j])
                {
                    ans ++;
                    Queue<Pair> queue = new LinkedList<>();
                    queue.add(new Pair(i,j));
                    used[i][j] = true;
                    while (!queue.isEmpty()){
                        Pair current = queue.poll();
                        for(int i1 = 0; i1 < 4 ;i1 ++){
                            Pair movement = new Pair(current.x + x[i1],current.y + y[i1]);
                            if(movement.x >= 0 && movement.x < n && movement.y >= 0 && movement.y < m && a[movement.x][movement.y] == '*' && !used[movement.x][movement.y] ){
                                used[movement.x] [movement.y] = true;
                                queue.add(movement);
                            }
                        }
                    }

                }

            }
        }
        System.out.println(ans);

    }
}
