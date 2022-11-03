package dp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class Recursive01 {
    static int a[];
    static int n;
    static List<Integer> list;
    static void go(int pos, List<Integer> list){
        if(pos == n){
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i) + " ");
            }
            System.out.println();
            return;
        }
        a[pos] = 0;
        if(!list.isEmpty())
            list.remove(0);
        go(pos + 1,list);
        list.add(pos);
        a[pos] = 1;
        go(pos + 1,list);
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        n = cin.nextInt();
        a = new int[100];
        list = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        go(0,list);


    }
}
