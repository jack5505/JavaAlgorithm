package leetcodes;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class SolveIt {
    public static void main(String[] args) {
        System.out.println(9 % 2);
    }
    public String longestCommonPrefix(String[] strs) {
        String temp = "";
        int mx = 201;
        for (int i = 0; i < strs.length ; i++) {
            if(strs[i].length() < mx){
                mx = strs[i].length();
                temp = strs[i];
            }
        }
        if(temp.isEmpty())
            return "";
        int start = 0;
        int start1 = 0;
        while (start < temp.length()){
            boolean found = true;
            for (int i = 0; i < strs.length ; i++) {
                    if(strs[i].charAt(start) != temp.charAt(start))
                        found = false;
            }
            if(!found)
                break;
            start++;
        }
        System.out.println(temp.substring(0,start));
        return temp.substring(0,start);
    }
}
