package leetcodes;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class Dp {
    public static void main(String[] args) {
        int n = 3;
        int m = 4;
        int dp [] [] = new int[n][m];

        for (int i = 0; i < n; i++)
            dp[i][0] = 1;

        for (int j = 0; j < m; j++)
            dp[0][j] = 1;

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++)

                // By uncommenting the last part the
                // code calculates the total possible paths
                // if the diagonal Movements are allowed
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1]; //+ count[i-1][j-1];
        }
        for(int i =  0 ; i < n; i++){
            for(int j = 0 ; j < m;j ++){
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(dp[n - 1][m - 1]);
    }
}
