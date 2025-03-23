package leetcodes;


import java.util.Scanner;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class DpLeetCode {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int a[] = new int[n];
        for(int i = 0 ; i < n; i++){
            a[i] = cin.nextInt();
        }
        int target = cin.nextInt();
        DpLeetCode dp = new DpLeetCode();
        System.out.println(dp.searchInsert(a,target));



    }
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int dp[] = new int[nums.length];
        int mx = 0;
        for(int i = 0 ; i < n;i ++){
            dp[i] = 1;
            for(int j = 1 ; j < i ;j ++){
                if(nums[i] > nums[j] && dp[j] + 1 > dp[i]){
                    dp[i] = dp[j] + 1;
                    mx = Math.max(mx,dp[i]);
                }
            }
        }
        return mx;
    }
    public int jump(int[] nums) {
        if(nums.length == 1)
            return 0;
        int curr = nums[0];
        int n = nums.length ;
        int mx = n - 1, i;
        int ans = 0;
        int pos = 0;
        for(i = 1 ; i < n; i ++)
        {
            curr--;
            int temp = n - (pos + nums[i]);
            System.out.println(temp);
            if(temp <= mx){
                mx = temp;
                pos = i;
            }
            if(curr == 0)
            {
                ans ++;
                if(mx != 1)
                    curr = mx;
                mx = n - 1;
                i = pos;
            }
        }
        if(curr >= 1)
            ans ++;


        System.out.println(ans);
        return ans;


    }

    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right){
            int m = (left + right) / 2;
            if(nums[m] == target){
                return m;
            }
            else if(nums[m] < target){
                left = m + 1;
            }
            else
                right = m - 1;
        }
        return left;
    }
}
