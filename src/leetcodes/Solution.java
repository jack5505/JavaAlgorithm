package leetcodes;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class Solution {
    static int key;
    static  String answer;

    public static void main(String[] args) {
        getPermutation(9,2678);
        System.out.println(answer);;
    }

    public static void permute(String s, String ans){
        if(s.length() == 0){
            key--;
            if(key == 0)
                answer = ans;
            return;
        }
        for (int i = 0; i < s.length() ; i++) {
            char a = s.charAt(i);

            String res = s.substring(0, i) + s.substring(i + 1);
            permute(res,ans + a);
        }
    }
    public static String getPermutation(int n, int k) {
        String a = "";
        key = k;
        for(int i = 1 ; i <= n;i ++){
            a += i;
        }
        permute(a,"");
        return answer;

    }
}
