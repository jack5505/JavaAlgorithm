package graphs;

import java.util.PriorityQueue;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class Test {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(3);
        System.out.println(priorityQueue.size());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.size());
    }
}
