package graphs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class B {
    static boolean found;
    static boolean used[];
    static int ans;
    static void dfs(int start , int end, int cnt){
        if(cnt >= 1e5)
            return;
        if(start == end){
            ans = cnt;
            found = true;
            return;
        }
        if(end % 2 == 0 && end > start)
            dfs(start,end/2,cnt + 1);
        else
            dfs(start,end + 1,cnt + 1);
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int start, end;
        used = new boolean[(int) 2e6 + 1];
        start = cin.nextInt();
        end = cin.nextInt();
        dfs(start,end,0);
        System.out.println(ans);

    }
}
