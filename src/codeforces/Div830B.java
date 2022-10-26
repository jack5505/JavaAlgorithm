package codeforces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class Div830B {
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);
        int test = cin.nextInt();
        while (test -- > 0)
        {
            int n = cin.nextInt();
            String s = cin.next();
            List<Integer> list = new ArrayList<>();
            int cnt = 0;
            for(int i = 0 ; i < n ;i ++){
                if(s.charAt(i) == '1')
                    cnt++;
                else{
                    if(cnt >= 1)
                        list.add(i - cnt);
                    cnt = 0;
                }

            }
            if(cnt >= 1)
                list.add(n - 1);
            if(list.isEmpty() || (list.size() == 1 && list.get(0) == n - 1)){
                System.out.println(0);
                continue;
            }
            // need to see 1110000
            // need to see 00001111
            if(list.size() == 1){
                System.out.println(1);
                continue;
            }
//            for(Integer item : list){
//                System.out.println(item);
//            }
            int ans = 0;
            for(int i = list.size() - 1; i >= 0 ;i --){
                if(i == 0){
                    ans ++;
                    break;
                }
                else if(list.get(i) == n - 1)
                    ans ++;
                else{
                    ans += 2;
                }
            }
            System.out.println(ans);







        }
    }
}
