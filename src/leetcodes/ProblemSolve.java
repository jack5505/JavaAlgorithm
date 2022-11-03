package leetcodes;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class ProblemSolve {
    public static void main(String[] args) {
        Scanner cin  = new Scanner(System.in);
        int n = cin.nextInt();
        int m = cin.nextInt();
        int a[] = new int[n];
        int b[] = new int[m];
        for(int i = 0 ; i < n; i++){
            a[i] = cin.nextInt();
        }
        for(int  i = 0 ; i < m ; i ++){
            b[i] = cin.nextInt();
        }
        Map<Long,Boolean> map = new HashMap<>();
        long suma = 0;
        long prime = 107;
        for(int i =  0 ; i < n; i++){
            suma = 0;
            prime = 119;
            for(int j = i ; j < n;j ++){
                suma = (suma +  a[i] + 2 ) * prime;
                prime *= prime;
                map.put(suma,true);
            }
        }
        int ans = 0;
        for(int i = 0 ; i < b.length; i ++){
            suma = 0;
            prime = 119;
            for(int j = i ; j < b.length ; j ++){
                    suma = (suma + b[i] + 2) * prime;
                    prime *= prime;
                    if(map.containsKey(suma)){
                        ans = Math.max((j - i) + 1 , ans);
                    }
            }
        }
        System.out.println(ans);


    }
}
