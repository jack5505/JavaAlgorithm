package graphs;

import java.util.Scanner;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class Div1B {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String s = cin.next();
        int cnt1[] = new int[10];
        int cnt2[] = new int[10];
        int n = s.length();
        for(int i = 0 ; i < n; i++){
            cnt1[s.charAt(i) - '0']++;
            cnt2[s.charAt(i) - '0']++;
        }
        int best = 0;
        int bestId = -1;
        int bestNul = cnt1[0];

        for(int k = 0 ;  k <= cnt1[0] ; k++){
            cnt1[0] -= k;
            cnt2[0] -= k;

            for(int i = 1 ; i < 10; i++)
            {
                if(cnt1[i] == 0 || cnt2[10 - i ] == 0)
                    continue;
                int cur = k + 1;
                for(int j = 0 ; j < 10 ;j ++){
                    cur += Math.min((cnt1[j]) - ((i == j) ? 1 : 0),cnt2[9 - j] - (((10 - i) == (9 - j)) ? 1 : 0));
                }
                System.out.println(cur);
                if(best < cur){
                    best = cur;
                    bestId = i;
                    bestNul = k;
                }
            }
            cnt1[0] += k;
            cnt2[0] += k;
        }


    }
}
