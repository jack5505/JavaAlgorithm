package leetcodes;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class Hard1 {

    static int k;
    static  String answer;

    public static void permute(String s, String ans){
        if(s.length() == 0){
            k--;
            if(k == 0)
                answer = ans;
            return;
        }
        for (int i = 0; i < s.length() ; i++) {
            char a = s.charAt(i);

            String res = s.substring(0, i) + s.substring(i + 1);
            permute(res,ans + a);
        }
    }


    public static void main(String[] args) {
        String s = "123";
        k = 3;
        permute(s,"");
        System.out.println(answer);

    }
}
