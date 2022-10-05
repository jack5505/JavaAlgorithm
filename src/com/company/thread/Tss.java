package com.company.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class Tss {
    static class Fio{
        String name;
        String family;

        public Fio(String name, String family) {
            this.name = name;
            this.family = family;
        }
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        List<Fio> list = new ArrayList<>();
        for(int i = 1; i <= n; i ++){
            String name   = cin.next();
            String family = cin.next();
            list.add(new Fio(name,family));
        }
        int p [] = new int[n + 1];
        for(int i = 1 ; i <= n; i++){
            p[i] = cin.nextInt() - 1;
        }
        int cnt = 0;
        String handleMin = minHandle(list.get(p[1]).name,list.get(p[1]).family);
        for(int i = 2; i <= n ; i++)
        {
            Fio fio = list.get(p[i]);
            if(handleMin.compareTo(maxHandle(fio.name,fio.family)) >= 0){
                handleMin = maxHandle(fio.name,fio.family);
                cnt++;
            }
            else if(handleMin.compareTo(minHandle(fio.name,fio.family)) >= 0){
                handleMin = minHandle(fio.name,fio.family);
                cnt++;
            }
            else{
                System.out.println(cnt);
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");


    }
    private static String minHandle(String fio, String fio1){
        String handle;
        if(fio.compareTo(fio1) < 0){
            handle = fio;
        }else{
             handle = fio1;
        }
        return handle;
    }

    private static String maxHandle(String fio, String fio1){
        if(fio.compareTo(fio1) > 0){
            return fio;
        }
        return fio1;
    }

}
