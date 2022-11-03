package dp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class LongestIncresingSubsequenceBruteForce {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int a[] = new int[n + 1];
        for (int i = 0; i < n ; i++) {
            a[i] = cin.nextInt();
        }
        int ans = 0;
        for(int mask = 0 ; mask < (1 << n) ; mask++)
        {

            List<Integer> temp = new ArrayList<>();
            for(int i = 0 ; i < n ;i ++){
                if(((1 << i) & mask) != 0){
                    temp.add(a[i]);
                }
            }
            boolean yes = true;
            for(int i = 1; i < temp.size(); i ++){
                yes &= temp.get(i - 1) < temp.get(i);
            }
            if(yes){
                ans = Math.max(temp.size(),ans);
            }
        }
        System.out.println(ans);
    }
}
