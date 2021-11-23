package com.company.codeforces;

import java.util.Scanner;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class A {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n , m;
        n = cin.nextInt();
        m = cin.nextInt();
        int a[] = new int [n];
        for(int i = 1 ; i < n ;i ++){
            a[i] = cin.nextInt();
        }
        int start = 1;
        while (start < n && start != m){
            start = start + a[start];
        }



    }
}
