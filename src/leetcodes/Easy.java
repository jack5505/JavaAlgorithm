package leetcodes;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class Easy {

    public static void main(String[] args) {
        System.out.println(addDigits(0));
    }
    public String addBinary(String a, String b) {
        return "";
    }

    public  static int addDigits(int num) {
        while (length(num) != 1){
            num = valueDigits(num);
        }
        return num;
    }
    public  static int length(int x){
        if(x == 0)
            return 1;
        int ans = 0;
        while (x != 0){
            x /= 10;
            ans ++;
        }
        return ans;
    }
    public static int valueDigits(int x){
        int ans = 0;
        while (x != 0){
            ans += x % 10;
            x /= 10;
        }
        return ans;
    }


}
