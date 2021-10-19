package bruteForces;

import java.util.Scanner;

/**
 * @author Sabirov Jakhongir
 */
public class BruteForcesMask {
    /**
     * Bizda n ta buyum bor. Biz ulardan tanlash amalga oshirganimzida har bir buyum uchun ikkita variant bor, tanlangan to’plamga tegishliligi yoki tegishli emasligi. n ta razriyadli ikkilik sanoq sistemasida 0 dan 2n-1 gacha bo’lgan sonlarni ikkilikdagi kodida mumkin bo’lgan barcha kombinatsiyalar ko’riladi.
     * Masalan n=3 bo’lsa 0 dan 23-1 gacha sonlarning ikkilik kodlari:
     * 0-000    4-100
     * 1-001    5-101
     * 2-010    6-110
     * 3-011    7-111
     * Har bir kombinatsiyada sonning ikkilik kodidagi mos belgisi 1 ga teng bo’lsa uni tegishli, 0 ga teng bo’lsa tegishli emas deb olamiz.
     * @param args
     */
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int X = cin.nextInt();
        int a[] = new int[n];
        for(int i = 0 ; i < n; i ++){
            a[i] = cin.nextInt();
        }
        int ans = 0;
        for(int mask = 0 ; mask < (1 << n) ;mask ++){
            long sum  = 0;
            for(int i = 0 ;i  < n ;i ++){
                if((mask & (1 << i)) != 0)
                    sum += a[i];
            }
            if(sum == X)
                ans ++;
        }
        System.out.println(ans);



    }
}
