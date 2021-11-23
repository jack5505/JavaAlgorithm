package com.company.codeforces;

import java.util.Scanner;


/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class Edu {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int test = cin.nextInt();
        while (test -- > 0)
        {
            int n = cin.nextInt();
            int a = cin.nextInt();
            int b = cin.nextInt();
            int array [] = new int[n + 1];
            boolean used[] = new boolean[n + 1];
            for(int i = 1; i <= n; i++){
                used[i] = false;
            }
            used[b]  = true;
            used[a]  = true;
            array[0] = a;
            int start = n / 2;
            int index = 1;
            int temp  = n;
            start--;
            while (start > 0)
            {
                if(!used[temp])
                {
                    array[index ++] = temp;
                    used[temp] = true;
                    start--;
                }
                temp--;
            }
            array[index++] = b;
            int max = 0;
            for(int i = 1 ; i <= n && index <= n - 1; i++){
                if(!used[i]){
                    array[index++] = i;
                    max = Math.max(i,max);
                }
            }
            int mx = -1;
            int mn = n;
            for(int i = 0 ; i < n;i ++)
            {
                if(i < n / 2){
                    mn = Math.min(mn,array[i]);
                }else{
                    mx = Math.max(mx,array[i]);
                }
            }

            if(mn == a && mx == b)
            {
                for(int i = 0 ; i < n;i ++){
                    System.out.print(array[i] + " ");
                }
            }else{
                System.out.print(-1);
            }
            System.out.println();


        }

    }

}
