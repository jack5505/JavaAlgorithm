package leetcodes;

import java.util.Scanner;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class Hard {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String  word1 = cin.next();
        String  word2 = cin.next();
        int ans = 0;
        for(int i = 0 ; i < word2.length() ;i ++)
        {
            for(int j = 0 ; j < word1.length() ;j ++)
            {
                if(word2.charAt(i) == word1.charAt(j)){
                    int i1 = i + 1;
                    int j1 = j;
                    int temp = 1;
                    while (i1 < word2.length() && j1 < word1.length()){
                        if(word2.charAt(i1) == word1.charAt(j1)){
                            i1 ++;
                            j1 ++;
                            temp ++;
                        }else{
                            j1 ++;
                        }
                    }
                    ans = Math.max(temp,ans);
                }
            }
        }
        System.out.println(Math.max(word1.length(),word2.length())- ans);
    }
    public int minDistance(String word1, String word2) {
            return -1;
    }
}
