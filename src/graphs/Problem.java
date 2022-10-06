package graphs;

import java.util.Scanner;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class Problem {
    public  static int len (int x){
        int ans = 0;
        while (x != 0){
            x /= 10;
            ans ++;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int start = 10;
        int pw = 1;
        int ans = 0;
        int i = 0;
        int ansStart = (int) Math.pow(10,len(n) - 1);
        while (i < len(n)){
            int last = (n % start) / pw;
            pw *= 10;
            start *= 10;
            ans += last * ansStart;
            ansStart /= 10;
            i++;
        }
        System.out.println(ans);

    }
}
