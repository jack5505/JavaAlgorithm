package graphs;

import java.util.Scanner;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class BfsConnectionMatrix {
    // bog`lanishlar matritsa ko`rinishda bir uchdan bir uchaga bog`lanishlar
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int m = cin.nextInt();
        int a [][] =  new int[1001][1001];
        for(int i = 1 ; i <= m ;i ++){
            int v1 = cin.nextInt();
            int v2 = cin.nextInt();
            a[v1][v2] = 1;
            a[v2][v1] = 1;
        }
        for(int i = 1 ; i <= n ;i ++){
            for(int j = 1 ; j <= n;j ++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
