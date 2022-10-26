package codeforces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class Word {
    public static boolean isPalindrom(char a[]){
        int n = a.length - 1;
        for(int i = 1; i <= n / 2 ;i ++){
                if(a[i] != a[n - i + 1])
                    return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner cin  = new Scanner(System.in);
        String s = cin.next();
        s = cin.next();
        char a [] = new char[s.length() + 1];
        int n = s.length();
        for(int i = 1 ; i <= n ;i ++){
            a[i] = s.charAt(i - 1);
        }
        for(int i = 1 ; i <= n;i ++){
            if(a[i] == '?' && a[n - i + 1] != '?'){
                a[i] = a[n - i + 1];
            }
            if(a[i] == '?' && a[n - i + 1] == '?'){
                a[i] = a[n - i + 1] = 'a';
            }
        }
        if(!isPalindrom(a)){
            System.out.println("IMPOSSIBLE");
            return;
        }
        for(int i = 1 ;i <= n; i ++){
            System.out.print(a[i]);
        }




    }
}
