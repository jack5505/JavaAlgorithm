package dp;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class Lt {
    public static void main(String[] args) {

    }
    public int removeDuplicates(int[] nums) {
        int cnt = nums[0];
        int ans = 1;
        int start = 1;
        for(int i = 0 ; i < nums.length ;i ++)
        {
            if(cnt < nums[i]){
                cnt = nums[i];
                ans++;
                nums[start++] = nums[i];
            }
        }


        return ans;
    }
}
