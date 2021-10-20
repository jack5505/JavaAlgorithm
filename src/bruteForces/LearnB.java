package bruteForces;

import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @author Sabirov Jakhongir
 */
public class LearnB {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int test = cin.nextInt();
        //int test = 1;
        while (test -- > 0) {
            HashMap<Integer,Integer> hashMap = new HashMap<>();
            int n = cin.nextInt();
            for(int i = 0 ; i < n ;i ++){
                int temp = cin.nextInt();
                hashMap.put(temp, hashMap.getOrDefault(temp,0) + 1);
            }
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
            for(int x : hashMap.values())
                pq.add(x);

            while (pq.size() > 1){
                int first  = pq.poll();
                int second = pq.poll();
                first--;
                second--;
                if(first > 0){
                    pq.add(first);
                }
                if(second > 0){
                    pq.add(second);
                }
            }
            if(pq.isEmpty())
                System.out.println(0);
            else
                System.out.println(pq.poll());



        }
    }
}
