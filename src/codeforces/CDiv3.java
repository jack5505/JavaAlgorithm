package codeforces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class CDiv3 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        char a [] = new char[n];
        String s = cin.next();
        a = s.toCharArray();
        System.out.println(compress(a));




    }
    public static int compress(char[] chars) {
        int ans = 0;
        int cnt = 1;
        char [] temp = new char[chars.length + 1];
        int id = 0;
        temp = chars;
        for(int i = 0 ; i < temp.length - 1;i ++)
        {
            if(temp[i] == temp[i + 1])
                cnt++;
            else{
                chars[id++] = temp[i];
                if(cnt == 1){
                    cnt = 1;
                    continue;
                }
                String tt = cnt +"";
                int j = 0;
                while (j  < tt.length()){
                    chars[id++] = tt.charAt(j);
                    j++;
                }
                cnt = 1;
            }
        }
        if(cnt != 1){
                chars[id++] = temp[temp.length - 1];
            String tt = cnt +"";
            int j = 0;
            while (j  < tt.length()){
                chars[id++] = tt.charAt(j);
                j++;
            }
        }else{
            chars[id++] = temp[temp.length - 1];
        }
        return id;
    }
    public static int ans(int x){
        if(x == 1)
            return 1;
        int ans = 0;
        while (x >= 1){
            ans ++;
            x /= 10;
        }
        return ans + 1;
    }
}
