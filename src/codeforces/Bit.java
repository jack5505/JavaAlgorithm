package codeforces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class Bit {
    public static void main(String[] args) {

        System.out.println(isHappy(19));
     //   System.out.println(isHappy(102));
        System.out.println(isHappy(7));


    }
    public static char findTheDifference(String s, String t) {
        int cnt[] = new int[30];
        for (int i = 0; i < s.length() ; i++) {
            cnt[s.charAt(i) - 'a'] ++;
        }
        for(int i = 0 ; i < t.length() ;i ++){
            cnt[t.charAt(i) - 'a']--;
        }
        int ans = 0;
        for (int i = 0; i < 30 ; i++) {
            if(cnt[i] != 0)
                ans = i;
        }
        return (char) (ans + 'a');


    }
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0 ; i < nums.length ; i ++){
            set.add(nums[i]);
        }
        List<Integer> ans = new ArrayList<>();
        for(int i = 1 ; i <= nums.length ;i ++){
            if(!set.contains(i))
                ans.add(i);
        }
        return ans;
    }
    public  static void moveZeroes(int[] nums) {
        for(int i = 0 ;i <nums.length ;i ++)
        {
            if(nums[i] == 0)
            {
                int j = i;
                if(nums.length > i + 1)
                    j = i + 1;
                while (j < nums.length -1 && nums[j] == 0){
                    j++;
                }
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
    public static boolean isHappy(int n) {
            int cnt = 20;
            while (n >= 3 && cnt >= 1 ){
                int ans = 0;
                while (n != 0){
                    int x = n % 10;
                    ans += x * x;
                    n /= 10;
                }
                System.out.println(ans);
                n = ans;
            }
            return n == 1;
    }

}
