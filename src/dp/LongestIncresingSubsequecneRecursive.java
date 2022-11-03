package dp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class LongestIncresingSubsequecneRecursive {
    static int a [];
    static int n;
    public  static void go(int pos, List<Integer> list){
        if(pos == n){
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i));
            }
            System.out.println();
            list = new ArrayList<>();
            return;
        }
        list.add(a[pos]);
        go(pos + 1,list);
        list.add(a[pos]);
        go(pos + 1,list);
    }
    public static void main(String[] args)
    {

        Scanner cin = new Scanner(System.in);
        n = cin.nextInt();
        a = new int[n];
        for (int i = 0; i < n ; i++) {
            a[i] = cin.nextInt();
        }
        go(0,new ArrayList<>());


    }
}
