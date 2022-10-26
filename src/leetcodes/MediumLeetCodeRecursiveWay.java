package leetcodes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class MediumLeetCodeRecursiveWay {
    static int k;
    static int n;
    static void  go(List<Integer> list,int start){
        if(list.size()  == k){
            for (Integer integer : list) {
                System.out.print(integer);
            }
            System.out.println();
            return;
        }
        for (int i = start; i <= n ; i++) {
            list.add(i);
            go(list,i + 1);
            list.remove(list.size() - 1);
        }

    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        n = cin.nextInt();
        k = cin.nextInt();
        go(new ArrayList<>(),1);




    }
}
