package com.company.codeforces;

import java.util.Arrays;
import java.util.Scanner;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class CC {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int a [] = new int[n + 1];
        a[0] = 1;
        for(int i = 1 ; i <= n; i ++){
            a[i] = cin.nextInt();
        }
        int b[] = new int[n + 1];
        int start = 0;
        for(int i = 1 ;i <= n; i++){
            start += a[i];
            b[i] = start;
        }
        int m = cin.nextInt();
        while (m -- >0){
            int test = cin.nextInt();
            int index = Arrays.binarySearch(b,1,n + 1,test);
            if(index <= -1){
                System.out.println((index * -1) - 1);
            }else{
                System.out.println(index);
            }
        }


    }
}
