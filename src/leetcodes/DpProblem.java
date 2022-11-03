package leetcodes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class DpProblem {
    public List<List<String>> partition(String s) {
        int n = s.length();
        List<List<String>> ans = new ArrayList<>();
        for(int i = 0 ; i <= n ;i ++){
            ans.add(new ArrayList<>());
        }
        for(int mask = 0 ; mask < (1 << n); mask++)
        {
            String temp = "";
            for(int i = 0 ; i < n ; i ++)
            {
                if((mask & (1 << i)) != 0){
                    temp += s.charAt(i);
                }
            }
            if(temp.length() == 1){
                if(ans.get(0) == null)
                    ans.add(new ArrayList<>());
                ans.get(temp.length()).add(temp);
            }
            else{
                if(isPalnidrome(temp)){
                    ans.get(temp.length()).add(temp);
                }
            }

        }
        return ans;
    }
    static public  boolean isPalnidrome(String temp){
        for(int i = 0 ; i < temp.length() / 2; i ++){
                if(temp.charAt(i) != temp.charAt(temp.length() - 1 - i))
                    return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);



    }
}
