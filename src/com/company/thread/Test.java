package com.company.thread;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        // in this example you can see that main thread of this won't work order by as it was executed one
        for(int i = 1 ; i <= 10 ;i ++){
            new Thread(i + ""){
                @Override public void run() {
                    System.out.println("running " + getName() + "  running");
                }
            }.start();
        }

        MyRunnable myRunnable = new MyRunnable();

        Thread thread = new Thread(myRunnable);

        thread.start();

        // This is make sleep of out main Thread in that part MyRunnable thread will work fine
        try {
            Thread.sleep(10L * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // if we remove belo doStop then it will work till the end instead of main Thread
        myRunnable.doStop();
    }
}
