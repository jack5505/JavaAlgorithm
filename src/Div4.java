import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class Div4 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();
        while (t -- > 0){
            solve(cin);
        }
    }
    public static void solve(Scanner cin){
        int n = cin.nextInt();
        int cnt[] = new int[1001];
        int a[] = new int[n + 1];
        for(int i = 1 ; i <= n; i++){
            a[i] = cin.nextInt();
            cnt[a[i]] = i;
        }
        int maxe = 0;
        for(int i = 1; i <= 1000 ;i ++){
            for(int j = i  ; j <= 1000; j++){
                if(cnt[i] >= 1 && cnt[j] >= 1){
                    int gcd = gcd(i,j);
                    if(gcd == 1){
                        maxe = Math.max(maxe,cnt[i] + cnt[j]);
                    }
                }
            }
        }
        System.out.println(maxe == 0 ? -1 : maxe);


    }
    static int gcd(int a ,int b){
        if(b == 0)
            return a;
        return gcd(b, a % b);
    }
}
