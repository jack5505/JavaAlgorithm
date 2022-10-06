package graphs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class Lines {
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
        char path [] [] = new char[n + 1][n + 1];
        int len[][] = new int[n + 1][n + 1];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n; j++){
                len[i][j] = -1;
            }
        }
        int startx = -1,stary = -1;
        int endx = -1,endy = -1;
        for (int i = 0; i < n; i++) {
            String s = cin.next();
//            path[i] = s.toCharArray();
            for(int j = 0 ; j < s.length() ;j ++){
                path[i][j] = s.charAt(j);
                if(s.charAt(j) == '@'){
                    startx = i;
                    stary = j;
                }
                if(s.charAt(j) == 'X'){
                    endx = i;
                    endy = j;
                }
            }
        }
        boolean found = false;
        Queue<Pair> move = new LinkedList<>();
        move.add(new Pair(startx,stary));
        len[startx][stary] = 0;
        while (!move.isEmpty() && !found)
        {
            Pair current = move.poll();
            for(int i = 0 ; i < 4 ;i ++)
            {
                Pair movement = new Pair(current.x + x[i],current.y + y[i]);
                if(movement.x >= 0 && movement.x < n && movement.y >= 0 && movement.y < n)
                {
                    if(path[movement.x][movement.y] == '.' && len[movement.x][movement.y] == -1){
                        len[movement.x][movement.y] = len[current.x][current.y] + 1;
                        move.add(movement);
                    }
                    if(path[movement.x][movement.y] == 'X' && len[movement.x][movement.y] == -1){
                        found = true;
                        len[movement.x][movement.y] = len[current.x][current.y] + 1;
                        break;
                    }
                }
            }
        }
        if(found){
            while (path[endx][endy] != '@')
            {
                path[endx][endy] = '+';
                for(int i = 0 ; i < 4 ; i++){
                    Pair movement = new Pair(endx + x[i],endy + y[i]);
                    if(movement.x >= 0 && movement.x < n && movement.y >= 0 && movement.y < n && len[endx][endy] == len[movement.x][movement.y] + 1){
                        endx = movement.x;
                        endy = movement.y;
                        break;
                    }
                }
            }
            System.out.println("Yes");
            for (int i = 0; i < n; i++) {
                for (int i1 = 0; i1 < n; i1++) {
                    System.out.print(path[i][i1]);
                }
                System.out.println();
            }
            return;
        }
        System.out.println("No");









    }
}
