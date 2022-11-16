package graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class Div3D {
    static List<Integer> different = new ArrayList<>();
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int temp = n;
        int cnt[] = new int[8];
        int i = 0;
        while (temp >= 1){
            cnt[i++] = temp % 10;
            temp /= 10;
        }
        Arrays.sort(cnt,0,i );
        generate(cnt,0,i - 1);
        int mx = 0;
        int first = 0;
        int second = 0;
        for( i = 0 ; i < different.size() ;i ++)
        {
            for(int j = 0 ; j < different.size() ;j ++)
            {
                int calc = zeroCnt(different.get(i) + different.get(j));
                if(mx <= calc){
                    mx = calc;
                    first = different.get(i);
                    second = different.get(j);
                }
            }
        }
        System.out.println(first);
        System.out.println(second);

    }
    public  static int zeroCnt(int e){
        int ans = 0;
        while (e % 10 == 0){
            e /= 10;
            ans ++;
        }
        return ans;
    }

    static void generate(int[] p, int L, int R) {
        if (L == R) { // all numbers are set
            int ans = 0;
            int pow = (int) Math.pow(10,R);
            for(int i = 0 ; i <= R ;i ++){
                ans += p[i] * pow;
                pow /= 10;
            }
            different.add(ans);
            return;
        } else { // numbers at positions [0, L-1] are set, try to set L-th position
            for (int i = L; i <= R; i++) {
                int tmp = p[L]; p[L] = p[i]; p[i] = tmp;
                generate(p, L + 1, R);
                tmp = p[L]; p[L] = p[i]; p[i] = tmp;
            }
        }
    }

}
