package codeforces;

import java.util.Scanner;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class Test {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int test = cin.nextInt();
        while (test -- > 0){
            solve(cin);
        }
    }
    public static void solve(Scanner cin)
    {
        String first = cin.next();
        String second = cin.next();
        if(first.equals(second)){
            System.out.println("=");
            return;
        }
        char lastFirst  = first.charAt(first.length() - 1);
        char lastSecond = second.charAt(second.length() - 1);
        if(lastFirst > lastSecond){
            System.out.println("<");
        }
        if(lastFirst < lastSecond){
            System.out.println(">");
        }
        if(lastFirst == lastSecond){
            System.out.println(check(lastFirst,lastSecond,first.length(),second.length(),lastFirst));
        }

    }
    public static String check(char first, char second, int len1, int len2, char size){
        if(first == size && len1 > len2 && (size == 'M' || size =='L')){
            return ">";
        }
        else if(first == size && len1 < len2 && (size == 'M' || size =='L')){
            return "<";
        }else{
               if(first == size && len1 > len2){
                   return "<";
               }else{
                   return ">";
               }
        }
    }
}
