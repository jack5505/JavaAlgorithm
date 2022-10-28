package dp;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class NotEffectiveWay {
    static int ans;
    static Set<String> used;
    static void go(int i, int j, String first, String second){
        if(i >= first.length() || j >= second.length())
            return;
        if(first.charAt(i) == second.charAt(j) && i > j && !used.contains(i + "" + j)){
            used.add(i + "" + j);
            ans++;
            go(i,j + 1,first,second);
        }
        go(i + 1,j,first,second);

    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String s  = cin.next();
        String t = cin.next();
        used = new HashSet<>();
        go(0,0,s,t);
        System.out.println(ans);

    }
}
