package com.company.thread;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class RaceConditions {
    //Race conditions can occur when two or more threads read and write the same variable according to one of these two patterns:
    //
    //Read-modify-write
    //Check-then-act
    //Code that is safe to call by multiple threads simultaneously is called thread safe. If a piece of code is thread safe, then it contains no race conditions.
    // Race condition only occur when multiple threads update shared resources.
    // Therefore it is important to know what resources Java threads share when executing.

    //--------------------------
    //Local variables are stored in each thread's own stack.
    // That means that local variables are never shared between threads.
    // That also means that all local primitive variables are thread safe. Here is an example of a thread safe local primitive variable:

    //--------------------------
    //Local references to objects are a bit different.
    // The reference itself is not shared. The object referenced however, is not stored in each threads's local stack. All objects are stored in the shared heap.
    public static void main(String[] args) {
        NotThreadSafe sharedInstance = new NotThreadSafe();
        //If two threads call the add() method simultaneously on the same NotThreadSafe instance then it leads to race conditions. For instance:
        new Thread(new MyRun(sharedInstance)).start();
        new Thread(new MyRun(sharedInstance)).start();
        sharedInstance.add("test");
        //However, if two threads call the add() method simultaneously on different instances then it does not lead to race condition.
        // Here is the example from before, but slightly modified:
        new Thread(new MyRun(new NotThreadSafe())).start();
        new Thread(new MyRun(new NotThreadSafe())).start();







    }

}
