package codeforces;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class RoundB {
    static StringTokenizer st;
    static BufferedReader in;
    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        String s = next();
        String t = next();
        int diff = 0;
        int n = s.length();
        for(int i = 0 ; i < n;i ++){
            if(s.charAt(i) != t.charAt(i)) {
                diff++;
            }
        }
        if(diff % 2 != 0){
            System.out.println("impossible");
            return;
        }
        int cnt = 0;
        for(int i = 0 ; i < n; i ++){
            if(s.charAt(i) == t.charAt(i)){
               pw.print(s.charAt(i));
            }else{
                if(cnt % 2 == 0)
                    pw.print(s.charAt(i));
                else
                    pw.print(t.charAt(i));
                cnt++;
            }
        }
        pw.close();


    }
    private static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    private static long nextLong() throws IOException{
        return Long.parseLong(next());
    }

    private static double nextDouble() throws IOException{
        return Double.parseDouble(next());
    }

    private static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(in.readLine());
        }
        return st.nextToken();
    }
}
