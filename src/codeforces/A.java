package codeforces;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class A {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();
        while (t -- > 0){
            solve(cin);
        }
    }
    public static void  solve(Scanner cin){
        int n;
        n = cin.nextInt();
        int a[] = new int[n + 1];
        int sumP[] = new int[n + 1];
        for(int i = 1 ; i <= n; i ++){
            a[i] = cin.nextInt();
            sumP[i] = sumP[i - 1] + a[i];
        }
        Map<Integer,Integer> mp = new HashMap<>();
        int ans = 0;
        int mx = 0;
        for(int i = n ; i >= 1 ; i--)
        {
            mp.put(sumP[i],mp.getOrDefault(sumP[i],0) + 1);
            mx = Math.max(mx, mp.get(sumP[i]));
            if(a[i] == 0){
                ans += mx;
                mx = 0;
                mp.clear();
            }else{
                if(i == 1){
                    ans += mp.getOrDefault(0,0);
                }
            }
        }
        System.out.println(ans);

    }
}
