package com.company;

import java.util.Scanner;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class Learn1 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int a[][] = new int[6][6];
        int posi,posj;
        posi = posj = 0;
        for(int i = 1 ; i <= 5 ; i ++){
            for(int j = 1 ; j <= 5 ;j ++){
                a[i][j] = cin.nextInt();
                if(a[i][j] == 1){
                    posi = i;
                    posj = j;
                }
            }
        }
        int suma = Math.abs(3 - posi);
        suma += Math.abs(3 - posj);
        System.out.println(suma);




    }
}
