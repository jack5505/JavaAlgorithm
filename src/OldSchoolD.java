import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class OldSchoolD {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        char a[] [] = new char[n][n];
        String s;
        Map<Character,Integer> cnt = new HashMap<>();
        for(int i = 0 ; i < n;i ++){
            s = cin.next();
            for(int j = 0 ; j < s.length() ;j ++){
                a[i][j] = s.charAt(j);
                cnt.put(s.charAt(j),cnt.getOrDefault(s.charAt(j),0) + 1);
            }
        }
        boolean yes = true;
        char b = ' ';
        for(int i = 1 ; i < n; i++){
            yes &= (a[i][i] == a[i - 1][i - 1]);
        }
        for(int i = n - 1,st = 0 ; i >= 1 ; i--,st ++){
            yes &= (a[st][i] == a[st + 1][i - 1]);
            b = a[st][i];
        }
        if(yes && cnt.get(b) == (2 * n ) - 1 && cnt.size() == 2){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }




    }

}
