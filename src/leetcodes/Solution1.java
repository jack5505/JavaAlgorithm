package leetcodes;

import java.util.HashMap;
import java.util.Map;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class Solution1 {
    public static void main(String[] args) {
       // System.out.println(addStrings("1","9"));
      //  System.out.println(addStrings("0","0"));
       // System.out.println(addStrings("9","99"));;
       // System.out.println(addStrings("100","99"));;
       // System.out.println(addStrings("123","99"));;
        System.out.println(addStrings("9133","0"));;
        System.out.println(addStrings("9133","1"));;
    }
    public static boolean isIsomorphic(String s, String t) {
        Map<Character,Character> mp = new HashMap<>();
        Map<Character,Character> mpl = new HashMap<>();
        for(int i = 0 ; i < s.length() ; i++){
            if(mp.get(s.charAt(i)) != null && mp.get(s.charAt(i)) != t.charAt(i)){
                return false;
            }
            if(mpl.get(t.charAt(i)) != null && mpl.get(t.charAt(i))  != s.charAt(i)){
                return false;
            }
            mp.put(s.charAt(i),t.charAt(i));
            mpl.put(t.charAt(i),s.charAt(i));
        }
        return true;
    }


    public static String addStrings(String num1, String num2) {
            int i = num1.length() - 1;
            int j = num2.length() - 1;
            StringBuilder rt = new StringBuilder();
            int qoldiq = 0;
            while ( i >= 0 && j >= 0){
                int lastF = Integer.parseInt(num1.charAt(i) + "");
                int lastS = Integer.parseInt(num2.charAt(j) + "");
                int add = lastF + lastS + qoldiq;
                qoldiq = 0;
                qoldiq += (add != 0 &&  add % 10 == 0) ? 1 : (add >= 11 ? add / 10 : 0);
                rt.append(add % 10);
                i --;
                j --;
            }
            if(i >= 0){
                for(int k = i ; k >= 0; k --){
                    if(qoldiq >= 1) {
                        int t1 = Integer.parseInt(num1.charAt(k) + "") + qoldiq;
                        rt.append(t1 % 10);
                        qoldiq = t1 / 10;
                    }else{
                        rt.append(num1.charAt(k));
                    }
                }
            }
            if(j >= 0){
                for(int k = j ; k >= 0; k --){
                    if(qoldiq >= 1) {
                        int t = Integer.parseInt(num2.charAt(k) + "") + qoldiq;
                        rt.append(t % 10);
                        qoldiq = t / 10;
                    }else{
                        rt.append(num2.charAt(k));
                    }
                }
            }
            if(qoldiq >= 1){
                rt.append(qoldiq);
            }
            return rt.reverse().toString();
    }

}
