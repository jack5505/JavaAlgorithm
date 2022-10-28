package dp;

import java.util.Scanner;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class RecursiveWayLcs {
    public static int longest(String text1 , String text2, int i, int j){
        if(i == text1.length() || j == text2.length())
            return 0;
        if(text1.charAt(i) == text2.charAt(j)){
            return longest(text1,text2,i + 1,j + 1) + 1;
        }
        return Math.max(longest(text1,text2,i + 1,j),longest(text1,text2,i,j + 1));
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String text1 = cin.next();
        String text2 = cin.next();
        if(text1.length() > text2.length()){
            String temp = text2;
            text2 = text1;
            text1 = temp;
        }
        System.out.println(longest(text1,text2,0,0));
    }
}
