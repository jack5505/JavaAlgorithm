package com.company.codeforces;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class Practic {
    public static void main(String[] args) {
        Deque<Character> deque = new ArrayDeque<>();
        Scanner cin = new Scanner(System.in);
        String s = cin.nextLine();
        for(int i = 0 ; i < s.length() ;i ++){
            if(s.charAt(i) == '[' || s.charAt(i) == '{' || s.charAt(i) == '('){
                deque.add(s.charAt(i));
            }else{
                if(s.charAt(i) == ']' && deque.getLast().equals('[')){
                    deque.removeLast();
                }
                if(s.charAt(i) == '}' && deque.getLast().equals('{')){
                    deque.removeLast();
                }
                if(s.charAt(i) == ')' && deque.getLast().equals('(')){
                    deque.removeLast();
                }
            }
        }
        System.out.println(deque.isEmpty());
    }


}
