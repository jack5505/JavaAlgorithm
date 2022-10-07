package leetcodes;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class Problem {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> queue = new Stack<>();
        int n = asteroids.length;
        boolean rt = false;
        for(int i = 0 ; i < n ; i ++)
        {
            rt = false;
            if(asteroids[i] >= 1)
            {
                queue.add(asteroids[i]);
            }else{
                while (!queue.isEmpty())
                {
                    int front = queue.peek();
                    if(front >= 1)
                    {
                        if(front < Math.abs(asteroids[i])){
                            queue.pop();
                        }
                        else if(front == Math.abs(asteroids[i])){
                            queue.pop();
                            rt = true;
                            break;
                        }else{
                            rt = true;
                            break;
                        }
                    }else
                        break;
                }
                if(!rt)
                    queue.add(asteroids[i]);
            }
        }
        int ans[] = new int[queue.size()];
        int i = queue.size() - 1;
        while (i >= 0){
            ans[i--] = queue.peek();
            queue.pop();
        }
        return ans;
    }
}
