package codeforces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class Div252C {
    static class Coordinates{
        int x;
        int y;

        public Coordinates(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override public String toString() {
            return "Coordinates{" +
                "x=" + x +
                ", y=" + y +
                '}';
        }
    }
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);
        int n , m , k;
        n = cin.nextInt();
        m = cin.nextInt();
        k = cin.nextInt();
        List<Coordinates> list = new ArrayList<>();
        int startx = 1;
        int starty = 1;
        for(int i = 1; i <= n ; i++){
            for(int j = 1 ; j <= m ;j ++){
                list.add(new Coordinates(i,j));
            }
        }
        int row = k;
        int column = list.size() / k;
        boolean used [] = new boolean [list.size()];
        int col = 0;
        int ro = 0;
        Coordinates ans[][] = new Coordinates[row + 1][column];
        int t = list.size();
        Coordinates start = list.get(0);
        used[0] = true;
        ans[0][0] = start;
        col++;
        for(int i = 0 ; i < t ;i ++)
        {

            for(int j = 0 ; j < t; j ++)
            {
                if((distanc(start,list.get(j)) || start == list.get(j)) && col < column && !used[j] && col < column)
                {
                    ans[ro][col] = list.get(j);
                    used[j] = true;
                    start = list.get(j);
                    col++;
                }
            }

            col = 0;
            for(int i1 = 0 ; i1 < t ; i1 ++){
                if(!used[i1]){
                    start = list.get(i1);
                    break;
                }
            }
            ro ++;
            ro %= k;
        }
        for (int i = 0; i < row; i++) {
            for(int j = 0 ; j < column ; j ++){
                System.out.print(ans[i][j].x +" " + ans[i][j].y + " ");
            }
            System.out.println();
        }
    }
    public static boolean distanc(Coordinates x,Coordinates x1){
            return Math.abs(x.x - x1.x) + Math.abs(x.y - x1.y) == 1;
    }
}
