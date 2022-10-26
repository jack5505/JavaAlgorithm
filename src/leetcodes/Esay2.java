package leetcodes;

import java.util.Scanner;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class Esay2 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String s = cin.next();
        String t = cin.next();
        System.out.println(isSubsequence(s,t));
    }
    public static boolean isSubsequence(String s, String t) {
        int st = 0;
        for (int i = 0; i < s.length() && st < s.length() ; i++) {
                if(s.charAt(st) == t.charAt(i)){
                    st ++;
                }
        }
        return st == s.length();
    }
}
