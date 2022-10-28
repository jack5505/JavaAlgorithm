package leetcodes;

import java.util.Scanner;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class RecursiveLearn {

    static int n;
    static int ans;
    static void summa(int pos,int [] a, int suma){
        if(pos == n - 1){
            System.out.println(suma);
            ans = suma;
            return;
        }
        summa(pos + 1,a,suma + a[pos]);
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        n = cin.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n ; i++) {
            a[i] = cin.nextInt();
        }
        int sum = 0;
        summa(0,a,sum);
        System.out.println(ans);


    }
}
