import java.util.Scanner;

/*
 *
 *  @author Sabirov Jakhongir
 * MSU 
 */
public class LearnDp {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int a[] = new int[n];
        for(int i = 1 ; i <= n; i++){
            a[i] = cin.nextInt();
        }
        int dp[] = new int[n];
        for(int i = 1 ; i <= n ; i++){
            dp[i] = dp[i - 1] + a[i];
            if(i > 1){
                dp[i] = Math.max(dp[i],dp[i - 2]) + a[i];
            }
        }
        System.out.println(dp[n]);

    }
}
