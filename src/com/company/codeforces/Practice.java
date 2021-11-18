package com.company.codeforces;


import java.util.Scanner;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class Practice {
    public static boolean simpleInt(int cnt){
        for(int i = 2; i * i <= cnt;i ++){
            if(cnt % i == 0)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        if(n % 2 == 0){
            int get = 4;
            while (!simpleInt(n - get)){
                get += 2;
            }
            System.out.println(get +" " + (n - get));
        }else{
            int get = 6;
            while (!simpleInt(n - get)){
                get += 3;
            }
            System.out.println(get + " " + (n - get));
        }
    }

}
