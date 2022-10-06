package graphs;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class KnightBfs {
    static class Knight{
        int x,y;

        public Knight(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    static int dx[] = {2,2,-2,-2,1,-1,1,-1};
    static int dy[] = {1,-1,1,-1,2,2,-2,-2};
    static boolean used[][] = new boolean[22][22];
    static int d[][] = new int[22][22];
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        Queue<Knight> queue = new LinkedList<>();
        int startx,starty;
        int endx,endy;
        startx = cin.nextInt();
        starty = cin.nextInt();
        endx = cin.nextInt();
        endy = cin.nextInt();
        queue.add(new Knight(startx,starty));
        used[startx][starty] = true;
        d[startx][starty] = 0;
        while (!queue.isEmpty())
        {
            Knight from = queue.poll();
            for(int i = 0 ; i < 8 ; i ++){
                Knight item = new Knight(from.x + dx[i],from.y + dy[i]);
                if(item.x >= 1 && item.x <= n && item.y >= 1 && item.y <= n && !used[item.x][item.y]){
                    used[item.x] [item.y] = true;
                    queue.add(item);
                    d[item.x][item.y] = d[from.x][from.y] + 1;
                }
            }
        }
        System.out.println(d[endx][endy]);


    }
}
