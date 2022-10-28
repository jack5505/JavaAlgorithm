package dp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class LcS {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String text1 = cin.next();
        String text2 = cin.next();
        if(text1.length() > text2.length()){
            String temp = text2;
            text2 = text1;
            text1 = temp;
        }
        int cnt = 0;
        List<Integer> post = new ArrayList<>();
        for(int i = 0 ; i < text1.length() ;i ++){
            boolean found = false;
            for(int j = 0 ; j < text2.length() ;j ++){
                if(text1.charAt(i) == text2.charAt(j) && (post.isEmpty() || (!post.isEmpty() && j > post.get(post.size() - 1)))){
                    found = true;
                    post.add(j);
                }
            }
            if(found)
                cnt++;
        }
        System.out.println(cnt);

    }
}
