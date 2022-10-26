package codeforces;

import java.util.Scanner;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class Div240C {
    /**
     * 3
     * < 1 Y
     * < 2 Y
     * > -2 Y
     * @param args
     */
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        String s;
        int val;
        String result;
        int mx = (int) -2e9;
        int mn = (int) 2e9;
        //System.out.println(mx +" " + mn);
        for(int i = 1 ; i <= n ;i ++)
        {
            s = cin.next();
            val = cin.nextInt();
            result = cin.next();
            if(result.equals("N")){
                if(s.equals("<")){
                    s = ">=";
                }
                else if(s.equals("<=")){
                    s = ">";
                }
                else if(s.equals(">")){
                    s = "<=";
                }else{
                    s = "<";
                }
            }
            if(s.equals(">")){
                if(val + 1 > mx)
                    mx = val + 1;
            }
            else if(s.equals(">=")){
                if(val > mx)
                    mx = val;
            }
            else if(s.equals("<")){
                if(val - 1 < mn)
                    mn = val - 1;
            }
            else {
                if(val < mn)
                    mn = val;
            }
        }
//        System.out.println(mn +" " + mx);
        System.out.println(mx <= mn ? mx : "Impossible");





    }

}