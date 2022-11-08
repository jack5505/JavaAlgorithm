import java.util.Scanner;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class OldSchool {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int nol = cin.nextInt();
        int bir = cin.nextInt();
        int t = (bir + 1)  / 2;
        if( t - 1 > nol || nol - 1 > bir){
            System.out.println(-1);
            return;
        }
        StringBuilder ans = new StringBuilder();
        int cnt = -1;
        while (nol > 0 || bir > 0)
        {
            if( bir >= nol && cnt + 1 < 3 )
            {
                ans.append("1");
                bir--;
                if(cnt == -1)
                    cnt = 0;
                cnt++;
            }
            else if(cnt != 0 && nol >= 1 ){
                ans.append("0");
                cnt = 0;
                nol --;
            }
            else
                break;
        }
        if(bir >= 1 || nol >= 1)
            System.out.println(-1);
        else
            System.out.println(ans);




    }
}
