package codeforces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class C {
    static int N = 2000001;
    static class Pair{
        int x,y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n         = cin.nextInt();
        String first  = cin.next();
        String second = cin.next();
        int cnt1[] = new int[31];
        int cnt2[] = new int[31];
        Map<Character,Queue<Integer>> position1 = new HashMap<>();
        Map<Character,Queue<Integer>> position2 = new HashMap<>();
        int firstQuestion = 0;
        int secondQuestion = 0;
        for(int i = 0 ; i < first.length() ;i ++){
            if(first.charAt(i) != '?')
                cnt1[first.charAt(i) - 'a']  ++;
            else
                firstQuestion++;
            if(position1.get(first.charAt(i)) == null){
                position1.put(first.charAt(i),new PriorityQueue<>());
                Queue<Integer> queue = position1.get(first.charAt(i));
                queue.add(i + 1);
            }else{
                Queue<Integer> queue = position1.get(first.charAt(i));
                queue.add(i + 1);
            }

        }
        for(int i = 0 ; i < second.length(); i ++)
        {
            if(second.charAt(i) != '?')
                cnt2[second.charAt(i) - 'a'] ++;
            else
                secondQuestion++;
            if(position2.get(second.charAt(i)) == null){
                position2.put(second.charAt(i),new PriorityQueue<>());
                Queue<Integer> queue = position2.get(second.charAt(i));
                queue.add(i + 1);
            }else{
                Queue<Integer> queue = position2.get(second.charAt(i));
                queue.add(i + 1);
            }
        }
        List<Pair> answer = new ArrayList<>();
        for(char i = 'a';i <= 'z'; i ++)
        {
            if(cnt1[i - 'a'] >= 1 && cnt2[i - 'a'] >= 1)
            {
                int minAns = Math.min(cnt1[i - 'a'],cnt2[i - 'a']);
                cnt1[i - 'a'] -= minAns;
                cnt2[i - 'a'] -= minAns;
                Queue<Integer> queueF = position1.get(i);
                Queue<Integer> queueS = position2.get(i);
                while (minAns  >= 1){
                    Pair pair = new Pair(queueF.poll(),queueS.poll());
                    minAns--;
                    answer.add(pair);
                }
            }
        }
        if(firstQuestion >= 1)
        {
            Queue<Integer> queue = position1.get('?');
            for(char i = 'a' ; i <= 'z';i ++)
            {
                if(firstQuestion <= 0)
                    break;
                if(cnt2[i - 'a'] >= 1)
                {
                    int minAns = Math.min(cnt2[i - 'a'],firstQuestion);
                    cnt2[i - 'a'] -= minAns;
                    firstQuestion -= minAns;
                    Queue<Integer> queueS = position2.get(i);
                    while (minAns  >= 1){
                        Pair pair = new Pair(queue.poll(),queueS.poll());
                        minAns--;
                        answer.add(pair);
                    }


                }
            }
        }
        if(secondQuestion >= 1){
            Queue<Integer> queue = position2.get('?');
            for(char i = 'a' ; i <= 'z';i ++)
            {
                if(secondQuestion <= 0)
                    break;
                if(cnt1[i - 'a'] >= 1)
                {
                    int minAns = Math.min(cnt1[i - 'a'],secondQuestion);
                    Queue<Integer> queueS = position1.get(i);
                    cnt1[i - 'a'] -= minAns;
                    secondQuestion -= minAns;
                    while (minAns  >= 1){
                        Pair pair = new Pair(queueS.poll(),queue.poll());
                        minAns--;
                        answer.add(pair);
                    }
                }
            }
        }
        if(firstQuestion >= 1 && secondQuestion >=  1){
            Queue<Integer> queueF = position1.get('?');
            Queue<Integer> queueS = position2.get('?');
            while (!queueF.isEmpty() && !queueS.isEmpty()){
                Pair pair = new Pair(queueF.poll(),queueS.poll());
                answer.add(pair);
            }
        }
        System.out.println(answer.size());
        for(Pair i : answer){
            System.out.println(i.x +" " + i.y);
        }



    }
}