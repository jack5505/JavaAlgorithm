package leetcodes;

import java.util.Scanner;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class EasyUglyNumber {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(-2));
        System.out.println(isPowerOfTwo(1));
        System.out.println(isPowerOfTwo(0));


    }
    public static boolean isUgly(int n) {

        int a [] = new int[]{2,3,5};
        for(int i = 0 ; i < a.length ;i ++)
        {
                if(n % a[i] == 0 && n != 0)
                {
                    while (n % a[i] == 0)
                    {
                        n /= a[i];
                    }
                }
        }
        return n == 1;

    }
    public static boolean isPowerOfTwo(int n) {
            if(n == 1)
                return true;
            if(n == 0)
                return false;
            if(n <= -1){
                n *= -1;
            }
            while (n != 1){
                if(n % 2 == 0)
                    n /= 2;
                else
                    break;
            }
            return n == 1;

    }
}
