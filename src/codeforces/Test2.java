package codeforces;

import java.util.PriorityQueue;
import java.util.Queue;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class Test2 {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(3);
        System.out.println(queue.poll());
        System.out.println(queue.size());
    }
}
