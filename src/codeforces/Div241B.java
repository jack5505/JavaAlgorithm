package codeforces;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class Div241B {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int m = cin.nextInt();
        int n = cin.nextInt();
        int t[] []  = new int[m + 1][n + 1];
        int b [] = new int[m + 1];
        int extraTime [] = new int[n + 1];
        for(int i = 1; i <= m;i ++)
        {
            for(int j = 1 ; j<= n;j ++)
            {
                t[i][j] = cin.nextInt();
                b[i] += t[i][j];
            }
        }
        System.out.println(b[1]);
        int suma = 0;
        for(int i = 1 ; i <= n; i++){
            suma += t[1][i];
            extraTime[i] = b[1] - suma;
        }
        suma = b[1];
        int extr = 0;
        for(int i = 2 ; i <= m ;i ++)
        {
            extr = 0;
            for(int j = 1 ; j <= n;j ++)
            {
                if(extraTime[j] > t[i][j]){
                    extraTime[j] -= t[i][j];
                }else{
                    extr = (t[i][j] - extraTime[j]);
                    suma += extr;
                    extraTime[j] = 0;
                }
            }
            extr = 0;
            int s = 0;
            for(int j = 1; j <= n ;j ++){
                s += t[i][j];
                extraTime[j] += (b[i] - s);
            }
            System.out.println(suma);
        }








    }

}
