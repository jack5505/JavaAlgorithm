package graphs;

import java.util.Scanner;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class EasyB {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        char a[][] = new char [4][4];
        for(int i = 0 ; i < 4 ; i++){
            a[i] = cin.next().toCharArray();
        }
        for(int i = 0 ; i <=2 ; i++)
        {
            for(int j = 0 ; j <= 2 ;j ++)
            {
                int cnt1 = 0,cnt2 = 0;
                for(int k = i ; k <= i + 1; k ++){
                    for(int k1 = j; k1 <= j + 1; k1 ++){
                        if(a[k][k1] == '#')
                            cnt1++;
                        else
                            cnt2++;
                    }
                }
                if(cnt1 >= 3 || cnt2 >= 3){
                    System.out.println("YES");
                    return;
                }
            }
        }
        System.out.println("NO");

    }
}
